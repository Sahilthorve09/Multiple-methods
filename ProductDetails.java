package assignment;

public class ProductDetails {

	public static void main(String[] args) {
		Product data = new Product(1001, "Gel Pen", 10, 5);
		data.displayDetails();
		System.out.println("");
		data.addStock(10);
		data.purchaseProduct(5);
		System.out.println("");
		data.displayDetails();
	}
	
}
