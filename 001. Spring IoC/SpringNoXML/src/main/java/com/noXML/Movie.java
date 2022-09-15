package com.noXML;

public class Movie {
//	Dependency Injection
	private Song song;

	public void play() {
		System.out.println("Movie is playing in Cinema");
		this.song.sing();
	}

	public Song getSong() {
		return song;
	}

	public void setSong(Song song) {
		this.song = song;
	}

	public Movie(Song song) {
		super();
		this.song = song;
	}

	@Override
	public String toString() {
		return "Movie [song=" + song + "]";
	}

}
