package com.example.rest.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.persistence.domain.Song;

public class PlaylistDTO {
	
	private Long id;
	private String playlistid;
	private String playlisttitle;
	private String playlistdescr;
	private String playlistcreationdate;
	private String playlistimg;
	
	private List<Song> songs = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlaylistid() {
		return playlistid;
	}

	public void setPlaylistid(String playlistid) {
		this.playlistid = playlistid;
	}

	public String getPlaylisttitle() {
		return playlisttitle;
	}

	public void setPlaylisttitle(String playlisttitle) {
		this.playlisttitle = playlisttitle;
	}

	public String getPlaylistdescr() {
		return playlistdescr;
	}

	public void setPlaylistdescr(String playlistdescr) {
		this.playlistdescr = playlistdescr;
	}

	public String getPlaylistcreationdate() {
		return playlistcreationdate;
	}

	public void setPlaylistcreationdate(String playlistcreationdate) {
		this.playlistcreationdate = playlistcreationdate;
	}

	public String getPlaylistimg() {
		return playlistimg;
	}

	public void setPlaylistimg(String playlistimg) {
		this.playlistimg = playlistimg;
	}

	public List<Song> getSongs() {
		return songs;
	}

	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}

	public PlaylistDTO(Long id, String playlistid, String playlisttitle, String playlistdescr,
			String playlistcreationdate, String playlistimg, List<Song> songs) {
		super();
		this.id = id;
		this.playlistid = playlistid;
		this.playlisttitle = playlisttitle;
		this.playlistdescr = playlistdescr;
		this.playlistcreationdate = playlistcreationdate;
		this.playlistimg = playlistimg;
		this.songs = songs;
	}

	public PlaylistDTO() {
		super();
	}

	@Override
	public String toString() {
		return "PlaylistDTO [id=" + id + ", playlistid=" + playlistid + ", playlisttitle=" + playlisttitle
				+ ", playlistdescr=" + playlistdescr + ", playlistcreationdate=" + playlistcreationdate
				+ ", playlistimg=" + playlistimg + ", songs=" + songs + "]";
	}

}
