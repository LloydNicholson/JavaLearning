import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	
	private static ArrayList<Album> albums = new ArrayList<Album>();

	public static void main(String[] args) {
		Album album = new Album("Roadhouse", "McD");
		album.addSong("YEah", 2.21);
		album.addSong("Nowar", 4.30);
		album.addSong("sasas", 2.05);
		album.addSong("He man", 3.21);
		album.addSong("Lay lay lady", 3.54);
		albums.add(album);
		
		album = new Album("For those below", "Yoyo");
		album.addSong("Y122ah", 2.1);
		album.addSong("sasas", 5.30);
		album.addSong("fdxxx", 2.56);
		album.addSong("He xzxxz", 3.34);
		album.addSong("lsalsas", 2.54);
		albums.add(album);
		
		LinkedList<Song> playlist = new LinkedList<Song>();
		albums.get(0).addToPlaylist("YEah", playlist);
		albums.get(0).addToPlaylist("He man", playlist);
		albums.get(0).addToPlaylist("Lay lay lady", playlist);
		albums.get(0).addToPlaylist(3, playlist);
		albums.get(0).addToPlaylist(4, playlist);
		albums.get(1).addToPlaylist("fdxxx", playlist);
		albums.get(1).addToPlaylist("lsalsas", playlist);
		albums.get(1).addToPlaylist("Y122ah", playlist);
		
		play(playlist);

	}
	
	private static void play(LinkedList<Song> playlist) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean goingForward = true;
		
		ListIterator<Song> listIterator = playlist.listIterator();
		if (playlist.size() == 0) {
			System.out.println("No songs in playlist");
			return;
		} else {
			System.out.println("Now playing " + listIterator.next().toString());
			printMenu();
		}
		
		while (!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();
			
			switch (action) {
			case 0:
				System.out.println("Playlist complete.");
				quit = true;
				break;
			case 1:
				if (!goingForward) {
					if (listIterator.hasNext()) {
						listIterator.next();
					}
					goingForward = true;
				}
				
				if (listIterator.hasNext()) {
					System.out.println("Now playing " + listIterator.next().toString());
				} else {
					System.out.println("You have reached the end of the playlist");
					goingForward = false;
				}
				break;
			case 2:
				if (goingForward) {
					if (listIterator.hasPrevious()) {
						listIterator.previous();
					}
					goingForward = false;
				}
				
				if (listIterator.hasPrevious()) {
					System.out.println("Now playing " + listIterator.previous().toString());
				} else {
					System.out.println("You have reached the beginning of the playlist");
					goingForward = true;
				}
				break;
			case 3:
				if (goingForward) {
					if (listIterator.hasPrevious()) {
						System.out.println("Now replaying "+ listIterator.previous().toString());
						goingForward = false;
					} else {
						System.out.println("We have reached the start of the list");
					}
				} else {
					if (listIterator.hasNext()) {
						System.out.println("Now replaying " + listIterator.next().toString());
						goingForward = true;
					} else {
						System.out.println("We have reached the end of the list");
					}
				}
				break;
			case 4:
				printlist(playlist);
				break;
			case 5:
				printMenu();
				break;
			case 6:
				if (playlist.size() > 0) {
					listIterator.remove();
					if (listIterator.hasNext()) {
						System.out.println("Now playing " + listIterator.previous().toString());
					} else if (listIterator.hasPrevious()) {
						System.out.println("Now playing " + listIterator.previous().toString());
					}
				}
				break;

			}
		}
	}

	private static void printMenu() {
		System.out.println("Available actions\npress ");
		System.out.println(	"0 - to quit\n" +
							"1 - to play next song\n" +
							"2 - to play previous song\n" +
							"3 - to replay the current song\n" +
							"4 - list songs in the playlist\n"+
							"5 - print available actions\n" + 
							"6 - remove current song from playlist");
		
	}
	
	

	private static void printlist(LinkedList<Song> playlist) {
		Iterator<Song> iterator = playlist.iterator();
		System.out.println("===============================");
		while (iterator.hasNext()) {
			System.out.println(iterator.next()/*.toString() also acceptable*/);
		}
		System.out.println("===============================");
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
