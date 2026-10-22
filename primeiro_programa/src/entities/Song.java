package entities;

import entities.enums.Genre;

public class Song {
	
	private String title;
	private String artist;
	private Integer durationSeconds;
	private Genre genre;
	
	public Song() {
	}

	public Song(String title, String artist, Integer durationSeconds, Genre genre) {
		this.title = title;
		this.artist = artist;
		this.durationSeconds = durationSeconds;
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public Integer getDurationSeconds() {
		return durationSeconds;
	}

	public void setDurationSeconds(Integer durationSeconds) {
		this.durationSeconds = durationSeconds;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	public static String formatDuration(int seconds) {
	    int minutes = seconds / 60;
	    int rest = seconds % 60;
	    return String.format("%02d:%02d", minutes, rest);
	}
	
	@Override
	public String toString() {
		return title + " - " 
				+ artist + " ("
				+ Song.formatDuration(durationSeconds)
				+ ") " + "[" + genre + "]"; 
	}
}
