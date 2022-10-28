package com.example.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Song {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(targetEntity = Playlist.class)
	@JsonBackReference
	private Playlist playlist;
	
	@Column
	private String songtitle;
	
	@Column
	private String songartist;
	
	@Column
	private float songlength;
	
	@Column
	@Min(1)
	@Max(5)
	private String songkey;
	
	@Column
	private String songalbumtitle;
	
	@Column
	private String songalbumimg;
	
	@Column
	@JsonFormat(pattern = "dd-MM-yyyy")
	private String songreleasedate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Playlist getPlaylist() {
		return playlist;
	}

	public void setPlaylist(Playlist playlist) {
		this.playlist = playlist;
	}

	public String getSongtitle() {
		return songtitle;
	}

	public void setSongtitle(String songtitle) {
		this.songtitle = songtitle;
	}

	public String getSongartist() {
		return songartist;
	}

	public void setSongartist(String songartist) {
		this.songartist = songartist;
	}

	public float getSonglength() {
		return songlength;
	}

	public void setSonglength(float songlength) {
		this.songlength = songlength;
	}

	public String getSongkey() {
		return songkey;
	}

	public void setSongkey(String songkey) {
		this.songkey = songkey;
	}

	public String getSongalbumtitle() {
		return songalbumtitle;
	}

	public void setSongalbumtitle(String songalbumtitle) {
		this.songalbumtitle = songalbumtitle;
	}

	public String getSongalbumimg() {
		return songalbumimg;
	}

	public void setSongalbumimg(String songalbumimg) {
		this.songalbumimg = songalbumimg;
	}

	public String getSongreleasedate() {
		return songreleasedate;
	}

	public void setSongreleasedate(String songreleasedate) {
		this.songreleasedate = songreleasedate;
	}

	public Song(Long id, Playlist playlist, @NotNull String playlistid, String songtitle, String songartist,
			float songlength, @Min(1) @Max(5) String songkey, String songalbumtitle, String songalbumimg,
			String songreleasedate) {
		super();
		this.id = id;
		this.playlist = playlist;
		this.songtitle = songtitle;
		this.songartist = songartist;
		this.songlength = songlength;
		this.songkey = songkey;
		this.songalbumtitle = songalbumtitle;
		this.songalbumimg = songalbumimg;
		this.songreleasedate = songreleasedate;
	}

	public Song() {
		super();
	}
	
	@Override
	public String toString() {
		return "Song [id=" + id + ", playlist=" + playlist + ", songtitle=" + songtitle
				+ ", songartist=" + songartist + ", songlength=" + songlength + ", songkey=" + songkey
				+ ", songalbumtitle=" + songalbumtitle + ", songalbumimg=" + songalbumimg + ", songreleasedate="
				+ songreleasedate + "]";
	}
	
	
}