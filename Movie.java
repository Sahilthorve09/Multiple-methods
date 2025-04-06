package assignment;

public class Movie {
	int movieId;
	String title;
	String genre;
	float rating;
	
	public Movie(int movieId, String title, String genre, float rating) {
		this.movieId = movieId;
		this.title = title;
		this.genre = genre;
		this.rating = rating;
	}
	
	public void isBlockblaster() {
		if(this.rating>=7.5) {
			System.out.println("Movie is blockblaster...");
		}
		else if(this.rating>=5.5 && this.rating<7.4) {
			System.out.println("Movie is average.....");
		}
		else {
			System.out.println("Movie is flop");
		}
	}
	
	public void displayMovieDetails() {
		System.out.println("Movie Id: "+this.movieId);
		System.out.println("Movie Name: "+this.title);
		System.out.println("Genere: "+this.genre);
		System.out.println("Rating: "+this.rating+"/10");
	}
}
