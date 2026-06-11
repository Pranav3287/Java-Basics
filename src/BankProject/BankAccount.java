package BankProject;

public class BankAccount {
	private double balance;
	public BankAccount(double balance) {
		this.balance=balance;
	}
	
	public synchronized void withraw(double amount) {
		System.out.println(Thread.currentThread().getName()+" wants to withdraw Rs."+amount);
		while(balance< amount) {
			System.out.println("Insufficient Balance..");
		}
		System.out.println(Thread.currentThread().getName()+" is waiting for deposit...");
		try {
			wait();
		}catch(Exception e) {
			e.getMessage();
		}
	}
	public synchronized void deposit(double amount) {
		System.out.println(Thread.currentThread().getName()+" Amount wants to deposit :"+amount);
		balance +=amount;
		
		System.out.println("Ramaining or Updated balance is Rs."+balance);
		System.out.println("Notifying all the customers..");
		notifyAll();
		
	}
	public synchronized void checkbalance(double balance) {
		System.out.println("Current balance = Rs "+balance);
	}
}
