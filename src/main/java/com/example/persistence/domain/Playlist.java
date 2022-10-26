package com.example.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Playlist {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer playlistnum;
	
	@Id
	@NotNull
	private String playlistid;
	
	private String playlisttitle;
	
	private String playlistdescr;
	
	@OneToMany
	private Integer songid;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private String playlistcreationdate;
	
	private String playlistimg;

	public Integer getPlaylistnum() {
		return playlistnum;
	}

	public void setPlaylistnum(Integer playlistnum) {
		this.playlistnum = playlistnum;
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

	public Integer getSongid() {
		return songid;
	}

	public void setSongid(Integer songid) {
		this.songid = songid;
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

	public Playlist(Integer playlistnum, @NotNull String playlistid, String playlisttitle, String playlistdescr,
			Integer songid, String playlistcreationdate, String playlistimg) {
		super();
		this.playlistnum = playlistnum;
		this.playlistid = playlistid;
		this.playlisttitle = playlisttitle;
		this.playlistdescr = playlistdescr;
		this.songid = songid;
		this.playlistcreationdate = playlistcreationdate;
		this.playlistimg = playlistimg;
	}

	public Playlist() {
		super();
	}

	@Override
	public String toString() {
		return "Playlist [playlistnum=" + playlistnum + ", playlistid=" + playlistid + ", playlisttitle="
				+ playlisttitle + ", playlistdescr=" + playlistdescr + ", songid=" + songid + ", playlistcreationdate="
				+ playlistcreationdate + ", playlistimg=" + playlistimg + "]";
	}
	
}
