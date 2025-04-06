package assignment;

public class BookDetails {
	
	public static void main(String[] args) {
		Book data = new Book(1201,"XYZ","ZYX",170,1);
		data.displayBookDetails();
		data.issueBook();
		System.out.println();
		data.issueBook();
		System.out.println();
		data.displayBookDetails();
		data.returnBook();
		System.out.println();
		data.displayBookDetails();
	}
	
}
