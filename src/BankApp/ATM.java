package BankApp;

public class ATM {
	private String username;
	private double amount;
	 public ATM() {
		 super();
	 }
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	public static void main(String[] args ) {
		ATM a1=new ATM();
		a1.setAmount(2000);
		a1.setUsername("Pranav");
		
		System.out.println("Username is :"+a1.getUsername());
		System.out.println("Amount is :"+a1.getAmount());
		
	}
}
