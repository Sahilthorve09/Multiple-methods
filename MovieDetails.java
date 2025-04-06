package assignment;

public class MovieDetails {
	
	public static void main(String[] args) {
		System.out.println("--------- Movie 1 -----------");
		Movie data1 = new Movie(9008, "Titanic", "James Cameron", 7.9f);
		data1.displayMovieDetails();
		data1.isBlockblaster();
		System.out.println();
		
		System.out.println("--------- Movie 2 -----------");
		Movie data2 = new Movie(2102, "Bombay Velvet", "Anurag Kashyap", 5.5f);
		data2.displayMovieDetails();
		data2.isBlockblaster();
		System.out.println();
		
		System.out.println("--------- Movie 3 -----------");
		Movie data3 = new Movie(34678, "Joker", "Shirish Kunder", 2.5f);
		data3.displayMovieDetails();
		data3.isBlockblaster();
		System.out.println();
	}
	
}
