package BankApp;

import java.util.Scanner;
class Bank{
	String name="Pranav";
	String pass="pass@pranav";
	void check(String name1,String p) {
	if(name.equals(name1) && pass.equals(p)) {
		System.out.println("Login Succeessfully");
	}else {
		System.out.println("Invalid Username ans password");
	}
}
}
public class Login extends Bank{
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Username");
		String name1=sc.nextLine();
		
		System.out.println("Enter the password");
		String p=sc.nextLine();
		
		Bank b1=new Bank();
		b1.check(name1, p);
		sc.close();
	}

}

