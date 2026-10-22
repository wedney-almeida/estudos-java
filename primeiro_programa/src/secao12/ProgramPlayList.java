package secao12;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.PlayList;
import entities.Song;
import entities.User;
import entities.enums.Genre;

public class ProgramPlayList {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter user data:");
		System.out.print("Name: ");
		String nameUser = sc.nextLine();
		System.out.print("Email: ");
		String emailUser = sc.nextLine();
		System.out.print("Playlist name: ");
		String playListName = sc.nextLine();
		
		User user = new User(nameUser, emailUser);
		PlayList playlist = new PlayList(playListName, new Date(), user);
		
		System.out.print("How many songs? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " song data:");
			System.out.print("Title: ");
			String title = sc.nextLine();
			System.out.print("Artist: ");
			String artistName = sc.nextLine();
			System.out.print("Duration (seconds): ");
			int duration = sc.nextInt();
			sc.nextLine();
			System.out.print("Genre: ");
			Genre genre =  Genre.valueOf(sc.nextLine());
			
			Song song = new Song(title, artistName, duration, genre);
			playlist.addSong(song);
		}
		
		System.out.println();
		System.out.println("PLAYLIST SUMMARY:");
		System.out.println(playlist);
		
		sc.close();
	}

}
