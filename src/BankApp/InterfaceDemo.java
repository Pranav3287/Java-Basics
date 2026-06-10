package BankApp;

public class InterfaceDemo implements CompanyInterface,CollegeInterface {
	public void set(String a,int b) {
		System.out.println("Person Name: "+a);
		System.out.println("year of passing: "+b);
	}
	public static void main(String[] args) {
		InterfaceDemo d1=new InterfaceDemo();
		d1.set("Pranav", 2027);
	}

}
