import java.util.ArrayList;

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
		
		Album album1 = new Album("For those below", "Yoyo");
		album.addSong("Y122ah", 2.1);
		album.addSong("sasas", 5.30);
		album.addSong("fdxxx", 2.56);
		album.addSong("He xzxxz", 3.34);
		album.addSong("lsalsas", 2.54);
		albums.add(album1);
		
		System.out.println(album);
		System.out.println(album1);
		
		

	}

}