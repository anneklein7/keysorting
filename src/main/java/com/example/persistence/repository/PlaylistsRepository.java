package com.example.persistence.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.persistence.domain.Playlist;

@Repository
public interface PlaylistsRepository extends JpaRepository<Playlist, String> {

	@Query("Find p from Playlist p where p.playlistid=?1")
	Optional<Playlist> playlistById(String playlistid);

	@Query("Find p from Playlist p where p.playlisttitle=?1")
	Optional<Playlist> playlistByTitle(String playlisttitle);
	
}
