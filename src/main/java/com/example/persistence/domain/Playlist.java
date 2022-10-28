package com.example.persistence.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Playlist {

<<<<<<< HEAD
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
=======
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer playlistnum;
	
	@Id
	@NotNull
	private String playlistid;
	
	private String playlisttitle;
	
	private String playlistdescr;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private String playlistcreationdate;
	
	private String playlistimg;
>>>>>>> eb7576cce0deb016c015a291e76915669e362a11

		@Column
		@NotNull
		private String playlistid;

		@Column
		@NotNull
		private String playlisttitle;

		@Column
		private String playlistdescr;
		
		@Column
		@JsonFormat(pattern = "dd-MM-yyyy")
		private String playlistcreationdate;
		
		@Column
		private String playlistimg;

		@OneToMany(mappedBy = "playlist", fetch = FetchType.EAGER)
		@OnDelete(action = OnDeleteAction.CASCADE)
		@JsonManagedReference
		@JsonIgnore
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

<<<<<<< HEAD
		public String getPlaylisttitle() {
			return playlisttitle;
		}

		public void setPlaylisttitle(String playlisttitle) {
			this.playlisttitle = playlisttitle;
		}

		public String getPlaylistdescr() {
			return playlistdescr;
		}
=======
	public String getPlaylistcreationdate() {
		return playlistcreationdate;
	}
>>>>>>> eb7576cce0deb016c015a291e76915669e362a11

		public void setPlaylistdescr(String playlistdescr) {
			this.playlistdescr = playlistdescr;
		}

		public String getPlaylistcreationdate() {
			return playlistcreationdate;
		}

		public void setPlaylistcreationdate(String playlistcreationdate) {
			this.playlistcreationdate = playlistcreationdate;
		}

<<<<<<< HEAD
		public String getPlaylistimg() {
			return playlistimg;
		}
=======
	public Playlist(Integer playlistnum, @NotNull String playlistid, String playlisttitle, String playlistdescr,
			Integer songid, String playlistcreationdate, String playlistimg) {
		super();
		this.playlistnum = playlistnum;
		this.playlistid = playlistid;
		this.playlisttitle = playlisttitle;
		this.playlistdescr = playlistdescr;
		this.playlistcreationdate = playlistcreationdate;
		this.playlistimg = playlistimg;
	}
>>>>>>> eb7576cce0deb016c015a291e76915669e362a11

		public void setPlaylistimg(String playlistimg) {
			this.playlistimg = playlistimg;
		}

<<<<<<< HEAD
		public List<Song> getSongs() {
			return songs;
		}

		public void setSongs(List<Song> songs) {
			this.songs = songs;
		}

		public Playlist(Long id, @NotNull String playlistid, @NotNull String playlisttitle, String playlistdescr,
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

		public Playlist() {
			super();
		}

		@Override
		public String toString() {
			return "Playlist [id=" + id + ", playlistid=" + playlistid + ", playlisttitle=" + playlisttitle
					+ ", playlistdescr=" + playlistdescr + ", playlistcreationdate=" + playlistcreationdate
					+ ", playlistimg=" + playlistimg + ", songs=" + songs + "]";
		}
		
		
		
=======
	@Override
	public String toString() {
		return "Playlist [playlistnum=" + playlistnum + ", playlistid=" + playlistid + ", playlisttitle="
				+ playlisttitle + ", playlistdescr=" + playlistdescr + ", playlistcreationdate="
				+ playlistcreationdate + ", playlistimg=" + playlistimg + "]";
	}
	
>>>>>>> eb7576cce0deb016c015a291e76915669e362a11
}
	
