package assignment;

public class BankAccount {
	int accountNumber;
	String accountHolder;
	double balance;
	
	public BankAccount(int accountNumber, String accountHolder, double balance) {
		
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
		
	}
	
	public void deposite(double value) {
		if (value>0) {
			this.balance = balance + value;
			System.out.println("Deposited Sucessfully: "+value);
		}
		else {
			System.out.println("Invalid value... Plese Re-Enter");
		}
	}
	
	public void withdraw(double value) {
		if (value>0 && balance >= value) {
			this.balance = balance - value;
			System.out.println("Withdrawed Sucessfully: "+value);
		}
		else {
			System.out.println("Invalid value... Plese Re-Enter");
		}
	}
	
	public void displayAccountDetails() {
		System.out.println("Account Number: "+this.accountNumber);
		System.out.println("Account Holder Name: "+this.accountHolder);
		System.out.println("Balance: "+this.balance);
	}
	
}
