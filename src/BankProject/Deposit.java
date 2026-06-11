package BankProject;

public class Deposit extends Thread {
	private double amount;
	private BankAccount account;
	public Deposit(String name,double amount, BankAccount account) {
		super(name);
		this.amount = amount;
		this.account = account;
	}
	public void run() {
		account.deposit(amount);
	}
	
}
