package assignment;

public class User {
	public static void main(String[] args) {
		BankAccount acc = new BankAccount(99870, "Sahil Thorve", 25000);
		acc.displayAccountDetails();
		System.out.println();
		acc.deposite(500);
		acc.withdraw(10);
		System.out.println();
		acc.displayAccountDetails();
		System.out.println();
		acc.withdraw(30);
		acc.displayAccountDetails();
	}
}
