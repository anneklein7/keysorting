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
import org.springframework.web.bind.annotation.RestController;

import com.example.persistence.domain.Song;
import com.example.rest.dto.SongDTO;
import com.example.service.SongService;

@RestController
public class SongController {
	@Autowired
	private SongService service;

	@PostMapping("/addSong/{id}")
	public SongDTO addSong(@RequestBody Song song) {
		return service.addSong(song);
	}
	
	@GetMapping("/allSongs")
	public List<SongDTO> getAllSongs(){
		return service.getAllSongs();
	}
	
	@GetMapping("/songById")
	public SongDTO readSongById(@PathParam("id") String id) {
		return service.readById(id);
	}
	
	@GetMapping("/songByKey")
	public SongDTO readSongByKey(@PathParam("key") String key) {
		return service.readByKey(key);
	}
	
	@GetMapping("/songByTitle")
	public SongDTO readSongByTitle(@PathParam("title") String title) {
		return service.readByTitle(title);
	}
	
	@GetMapping("/songByArtist")
	public SongDTO readByArtist(@PathParam("artist") String artist) {
		return service.readByArtist(artist);
	}
	
	@PutMapping("/updateSong/{id}")
	public SongDTO updateSong(@PathVariable String id, @RequestBody Song song) {
		return service.updateSong(id, song);
	}
	
	@DeleteMapping("/deleteSong/{id}")
	public boolean deleteSong(@PathVariable String id) {
		return service.deleteSong(id);
	}
	

}