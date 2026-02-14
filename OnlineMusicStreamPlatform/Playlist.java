package OnlineMusicStreamPlatform;
import java.util.*;

public class Playlist {
	String name;
	Set<String> songs = new HashSet<>();
	
	public Playlist(String name){
		this.name = name;
	}
	public void addSong(String song) {
		if(!songs.contains(song)) {
			songs.add(song);
			System.out.println(song+" is added to "+name);
		}
		else {
			System.out.println(song+" is already in the playlist");
		}
		
	}
	public void removeSong(String song) {
		if(!songs.isEmpty()) {
			songs.remove(song);
			System.out.println(song+" is removed from "+name);
		}
		else {
			System.out.println("Playlist is empty");
		}
		
	}
	public void displayPlaylist() {
		System.out.println("Playlist: "+name);
		for(String s: songs) {
			System.out.println("- "+s);
		}
	}

}
