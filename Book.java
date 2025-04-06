package assignment;

public class Book {
	
	int bookId;
	String title;
	String author;
	double price;
	int availableCopies;
	
	public Book(int bookId,String title,String author,double price,int availableCopies) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.availableCopies = availableCopies;
	}
	
	public void issueBook() {
		if(this.availableCopies>0) {
			this.availableCopies--;
			System.out.println("Book issue.....");
		}
		else {
			System.out.println("Book not available, Will available soon....");
		}
	}
	
	public void returnBook() {
		this.availableCopies++;
		System.out.println("Book Added.....");
		System.out.println("Thanks Visit Again!!");
	}
	
	public void displayBookDetails() {
		System.out.println("Book Name: "+this.title);
		System.out.println("Aurthor: "+this.author);
		System.out.println("Price: "+this.price);
		System.out.println("No of copies: "+this.availableCopies);
		System.out.println("------------------------------------");
	}
	
}
