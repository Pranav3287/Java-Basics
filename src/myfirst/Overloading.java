package myfirst;

class over{
	String Admin(String name,String salary,String Address) {
		return name+salary;	
	}
	int Admin(int salary) {
		return salary;	
	}
	double Admin(double Roll) {
		return Roll;
	}
	
}
public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		over o=new over();
		o.Admin(20000);
		o.Admin("Pranav", "two", "Kolhapur");
		o.Admin(20);
		System.out.println("Emp info:"+o.Admin(20000));
		System.out.println(o.Admin("Pranav", "two", "Kolhapur"));
		System.out.println("Roll no is:"+o.Admin(20));
	}

}
