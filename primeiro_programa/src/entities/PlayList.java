package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlayList {
	
	private String name;
	private Date creatdAt;
	private User owner;
	
	private List<Song> songs = new ArrayList<>();
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public PlayList() {
	}

	public PlayList(String name, Date creatdAt, User owner) {
		this.name = name;
		this.creatdAt = creatdAt;
		this.owner = owner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreatdAt() {
		return creatdAt;
	}

	public void setCreatdAt(Date creatdAt) {
		this.creatdAt = creatdAt;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public List<Song> getSongs() {
		return songs;
	}
	
	public void addSong(Song song) {
		songs.add(song);
	}
	
	public void removeSong(Song song) {
		songs.remove(song);
	}
	
	public int totalDuration() {
		int sum = 0;
		for(Song music : songs) {
			sum += music.getDurationSeconds();
		}
		return sum;
	}
	
	public Song longestSong() {
		Song longest = songs.get(0);
		
		for(Song song : songs) {
			if(song.getDurationSeconds() > longest.getDurationSeconds()) {
				longest = song;
			}
		}
		return longest;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name: ");
		sb.append(name + "\n");
		sb.append("Created at: ");
		sb.append(sdf.format(creatdAt) + "\n");
		sb.append("Owner: ");
		sb.append(owner + "\n");
		
		sb.append("Songs: \n");
		for(Song song : songs) {
			sb.append(song + "\n");
		}
		
		sb.append("Total duration: ");
		sb.append(Song.formatDuration(totalDuration()) + "\n");
		Song longest = longestSong();
		sb.append("Longest song: ");
		sb.append(longest.getTitle() + " (" + Song.formatDuration(longest.getDurationSeconds()) + ")");
		
		return sb.toString();
	}
}
