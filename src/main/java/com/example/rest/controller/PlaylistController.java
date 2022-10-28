package com.example.rest.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.persistence.domain.Playlist;
import com.example.rest.dto.PlaylistDTO;
import com.example.service.PlaylistService;

public class PlaylistController {
	@Autowired
	private PlaylistService service;

	@PostMapping("/addPlaylist/{id}")
	public PlaylistDTO addPlaylist(@RequestBody Playlist playlist) {
		return service.addPlaylist(playlist);
	}
	
	@GetMapping("/allPlaylists")
	public List<PlaylistDTO> getAllPlaylists(){
		return service.getAllPlaylists();
	}
	
	@GetMapping("/playlistById")
	public PlaylistDTO readPlaylistById(@PathParam("id") String id) {
		return service.readPlaylistId(id);
	}
	
	@GetMapping("/playlistByTitle")
	public PlaylistDTO readPlaylistByTitle(@PathParam("title") String title) {
		return service.readByPlaylistTitle(title);
	}
	
	@GetMapping("/playlistByTitle")
	public SongDTO readPlaylistSongsByTitle(@PathParam("title") String title) {
		return service.readPlaylistSongsByTitle(title);
	}
	
	@PutMapping("/updatePlaylist/{id}")
	public PlaylistDTO updatePlaylist(@PathVariable String id, @RequestBody Playlist playlist) {
		return service.updatePlaylist(id, playlist);
	}
	
	@DeleteMapping("/deletePlaylist/{id}")
	public boolean deletePlaylist(@PathVariable String id) {
		return service.deletePlaylist(id);
	}
	
	
}
