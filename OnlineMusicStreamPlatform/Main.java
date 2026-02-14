package OnlineMusicStreamPlatform;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playlist playlist = new Playlist("My Favorites");
		playlist.addSong("Shape of You");
		playlist.addSong("Blinding Lights");
		playlist.addSong("Shape of You");
		playlist.displayPlaylist();
		playlist.removeSong("Blinding Lights");
		playlist.displayPlaylist();

	}

}
