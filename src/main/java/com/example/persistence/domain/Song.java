package com.example.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Song {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long songnum;
	
	@Id
	@NotNull
	private Integer songid;
	
	@NotNull
	private String playlistid;
	
	private String songtitle;
	
	private String songartist;
	
	private float songlength;
	
	@Min(1)
	@Max(5)
	private String songkey;
	
	private String songalbumtitle;
	
	private String songalbumimg;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private String songreleasedate;

	public Long getSongnum() {
		return songnum;
	}

	public void setSongnum(Long songnum) {
		this.songnum = songnum;
	}

	public Integer getSongid() {
		return songid;
	}

	public void setSongid(Integer songid) {
		this.songid = songid;
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

	public Song() {
		super();
	}

	public Song(Long songnum, @NotNull Integer songid, @NotNull String playlistid, String songtitle,
			String songartist, float songlength, @Min(1) @Max(5) String songkey, String songalbumtitle,
			String songalbumimg, String songreleasedate) {
		super();
		this.songnum = songnum;
		this.songid = songid;
		this.playlistid = playlistid;
		this.songtitle = songtitle;
		this.songartist = songartist;
		this.songlength = songlength;
		this.songkey = songkey;
		this.songalbumtitle = songalbumtitle;
		this.songalbumimg = songalbumimg;
		this.songreleasedate = songreleasedate;
	}

	@Override
	public String toString() {
		return "Song [songnum=" + songnum + ", songid=" + songid + ", playlistid=" + playlistid + ", songtitle="
				+ songtitle + ", songartist=" + songartist + ", songlength=" + songlength + ", songkey=" + songkey
				+ ", songalbumtitle=" + songalbumtitle + ", songalbumimg=" + songalbumimg + ", songreleasedate="
				+ songreleasedate + "]";
	}
	

}