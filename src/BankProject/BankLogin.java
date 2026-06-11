package BankProject;

import java.util.Scanner;

public class BankLogin {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int number=sc.nextInt();
			BankAccount account = new BankAccount(number);

			Deposit c1= new Deposit("Pranav",30000,account);
			Withdraw c2= new Withdraw("Yash",300,account);
			
			c1.start();
			try {
				Thread.sleep(300);
			}catch(Exception e) {
				e.getMessage();
			}
			c2.start();
	}

}
