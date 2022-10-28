package com.example.persistence.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.persistence.domain.Song;

@Repository
public interface SongRepository extends JpaRepository<Song, String> {

	@Query("Find s from Song s where s.songid=?1")
	Optional<Song> readById(String songid);
	
	@Query("Find s from Song s where s.songtitle=?1")
	Optional<Song> songByTitle(String songtitle);
	
	@Query("Find s from Song s where s.songkey=?1")
	Optional<Song> songByKey(String songkey);
	
	@Query("Find s from Song s where s.songartist=?1")
	Optional<Song> readByArtist(String songartist);
}
