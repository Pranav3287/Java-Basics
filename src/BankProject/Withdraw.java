package BankProject;

public class Withdraw extends Thread {
		private double amount;
		private BankAccount account;
		
		public Withdraw(String name,double amount,BankAccount account) {
			super(name);
			this.account=account;
			this.amount=amount;
		}
		public void run() {
			account.withraw(amount);
		}
}
