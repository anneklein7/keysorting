package com.example.rest.dto;

import com.example.persistence.domain.Playlist;

public class SongDTO {
	
	private Long id;
	private Playlist playlist;
	private String playlistid;
	private String songtitle;
	private String songartist;
	private float songlength;
	private String songkey;
	private String songalbumtitle;
	private String songalbumimg;
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
	public String getPlaylistid() {
		return playlistid;
	}
	public void setPlaylistid(String playlistid) {
		this.playlistid = playlistid;
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
	public SongDTO(Long id, Playlist playlist, String playlistid, String songtitle, String songartist, float songlength,
			String songkey, String songalbumtitle, String songalbumimg, String songreleasedate) {
		super();
		this.id = id;
		this.playlist = playlist;
		this.playlistid = playlistid;
		this.songtitle = songtitle;
		this.songartist = songartist;
		this.songlength = songlength;
		this.songkey = songkey;
		this.songalbumtitle = songalbumtitle;
		this.songalbumimg = songalbumimg;
		this.songreleasedate = songreleasedate;
	}
	public SongDTO() {
		super();
	}
	@Override
	public String toString() {
		return "SongDTO [id=" + id + ", playlist=" + playlist + ", playlistid=" + playlistid + ", songtitle="
				+ songtitle + ", songartist=" + songartist + ", songlength=" + songlength + ", songkey=" + songkey
				+ ", songalbumtitle=" + songalbumtitle + ", songalbumimg=" + songalbumimg + ", songreleasedate="
				+ songreleasedate + "]";
	}
	

}
