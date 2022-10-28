package com.example.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.PlaylistNotFoundException;
import com.example.persistence.domain.Playlist;
import com.example.persistence.repository.PlaylistRepository;
import com.example.rest.dto.PlaylistDTO;

@Service
public class PlaylistService {
	@Autowired
	private PlaylistRepository repo;
	@Autowired
	private ModelMapper mapper;
	
	private PlaylistDTO mapToDTO(Playlist playlist) {
		return this.mapper.map(playlist, PlaylistDTO.class);
	}

	public PlaylistDTO addPlaylist(Playlist playlist) {
		Playlist saved = this.repo.save(playlist);
		return this.mapToDTO(saved);
	}
	
	public List<PlaylistDTO> getAllPlaylists() {
		return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
	}
	
	public PlaylistDTO updatePlaylist(String id, Playlist playlist) {
		Optional<Playlist> tempPlaylist = Optional.of(this.repo.findById(id).orElseThrow(PlaylistNotFoundException::new));
		
		Playlist existing = tempPlaylist.get();
		existing.setPlaylistid(playlist.getPlaylistid());
		existing.setPlaylisttitle(playlist.getPlaylisttitle());
		existing.setPlaylistdescr(playlist.getPlaylistdescr());
		existing.setPlaylistcreationdate(playlist.getPlaylistcreationdate());
		existing.setPlaylistimg(playlist.getPlaylistimg());
		
		Playlist updated = this.repo.save(existing);
		return this.mapToDTO(updated);
	}
	
	public PlaylistDTO readPlaylistId(String id) {
        Playlist found = this.repo.findById(id).orElseThrow(PlaylistNotFoundException::new);
        return this.mapToDTO(found);
    }
	
	public PlaylistDTO readByPlaylistTitle(String title) {
		Playlist found = this.repo.playlistByTitle(title).orElseThrow(PlaylistNotFoundException::new);
		return this.mapToDTO(found);
	}
	
	public boolean deletePlaylist(String id) {
		this.repo.findById(id).orElseThrow(PlaylistNotFoundException::new);
		this.repo.deleteById(id);
		boolean exists = this.repo.existsById(id);
		return !exists;
	}

}