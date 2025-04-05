package assignment;

public class Product {
	
	int productId;
	String productName;
	double price;
	int stock;
	
	public Product(int productId,String productName,double price,int stock) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.stock = stock;		
	}
	
	public void purchaseProduct(int noofStock) {
		if(noofStock>0 && noofStock<=this.stock) {
			this.stock = stock - noofStock;
			System.out.println("Product Purchesed..."+noofStock);
			System.out.println("Remaining Stock is..."+stock);
		}
		else {
			System.out.println("Plese enter Valid no of stock...");
		}
	}
	
	public void addStock(int noofStock) {
		if(noofStock>0) {
			this.stock = stock + noofStock;
			System.out.println("Stock Added... "+noofStock);
			System.out.println("Available stock is... "+stock);
			System.out.println("-----------------------------");
		}
		else {
			System.out.println("Plese enter Valid no of stock...");
		}
	}
	
	public void displayDetails() {
		System.out.println("Product ID: "+productId);
		System.out.println("Product Name: "+productName);
		System.out.println("Price of Product: "+price);
		System.out.println("Stock Quantity: "+stock);
		System.out.println("-------------------------------------");
	}
	

}
