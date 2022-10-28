package com.example.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
<<<<<<< HEAD
=======

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.persistence.domain.Song;
import com.example.persistence.repository.SongRepository;
import com.example.rest.dto.SongDTO;

@Service
public class SongService {
	@Autowired
	private SongRepository repo;
	@Autowired
	private ModelMapper mapper;
	
	private SongDTO mapToDTO(Song song) {
		return this.mapper.map(song, SongDTO.class);
	}
	
	public SongDTO addSong(Song song) {
		Song saved = this.repo.save(song);
		return this.mapToDTO(saved);
	}
	
	public List<SongDTO> getAllSongs() {
		return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
	}
	
	public SongDTO updateSong(String id, Song song) {
		Optional<Song> tempSong = Optional.of(this.repo.findById(id).orElseThrow(SongNotFoundException::new));
		
		Song existing = tempSong.get();
		existing.setSongtitle(song.getSongtitle());
		existing.setSongartist(song.getSongartist());
		existing.setSonglength(song.getSonglength());
		existing.setSongkey(song.getSongkey());
		existing.setSongalbumtitle(song.getSongalbumtitle());
		existing.setSongalbumimg(song.getSongalbumimg());
		existing.setSongreleasedate(song.getSongreleasedate());
		
		Song updated = this.repo.save(existing);
		return this.mapToDTO(updated);
	}
	
	public SongDTO readById(String id) {
        Song found = this.repo.findById(id).orElseThrow(SongNotFoundException::new);
        return this.mapToDTO(found);
    }
	
	public SongDTO readByTitle(String title) {
		Song found = this.repo.songByTitle(title).orElseThrow(SongNotFoundException::new);
		return this.mapToDTO(found);
	}
	
	public boolean deleteSong(String id) {
		this.repo.findById(id).orElseThrow(SongNotFoundException::new);
		this.repo.deleteById(id);
		boolean exists = this.repo.existsById(id);
		return !exists;
	}
>>>>>>> eb7576cce0deb016c015a291e76915669e362a11

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.SongNotFoundException;
import com.example.persistence.domain.Song;
import com.example.persistence.repository.SongRepository;
import com.example.rest.dto.SongDTO;

@Service
public class SongService {
	@Autowired
	private SongRepository repo;
	@Autowired
	private ModelMapper mapper;
	
	private SongDTO mapToDTO(Song song) {
		return this.mapper.map(song, SongDTO.class);
	}
	
	public SongDTO addSong(Song song) {
		Song saved = this.repo.save(song);
		return this.mapToDTO(saved);
	}
	
	public List<SongDTO> getAllSongs() {
		return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
	}
	
	public SongDTO updateSong(String id, Song song) {
		Optional<Song> tempSong = Optional.of(this.repo.findById(id).orElseThrow(SongNotFoundException::new));
		
		Song existing = tempSong.get();
		existing.setSongtitle(song.getSongtitle());
		existing.setSongartist(song.getSongartist());
		existing.setSonglength(song.getSonglength());
		existing.setSongkey(song.getSongkey());
		existing.setSongalbumtitle(song.getSongalbumtitle());
		existing.setSongalbumimg(song.getSongalbumimg());
		existing.setSongreleasedate(song.getSongreleasedate());
		
		Song updated = this.repo.save(existing);
		return this.mapToDTO(updated);
	}
	
	public SongDTO readById(String id) {
        Song found = this.repo.readById(id).orElseThrow(SongNotFoundException::new);
        return this.mapToDTO(found);
    }
	
	public SongDTO readByTitle(String title) {
		Song found = this.repo.songByTitle(title).orElseThrow(SongNotFoundException::new);
		return this.mapToDTO(found);
	}
	
	public SongDTO readByKey(String key) {
		Song found = this.repo.songByKey(key).orElseThrow(SongNotFoundException::new);
		return this.mapToDTO(found);
	}
	
	public SongDTO readByArtist(String artist) {
		Song found = this.repo.readByArtist(artist).orElseThrow(SongNotFoundException::new);
		return this.mapToDTO(found);
	}
	
	public boolean deleteSong(String id) {
		this.repo.findById(id).orElseThrow(SongNotFoundException::new);
		this.repo.deleteById(id);
		boolean exists = this.repo.existsById(id);
		return !exists;
	}

}