package myfirst;

class Manager{
	String name="Pranav";
	void work1() {
		System.out.println("Emp is working");
	}
}
class HR extends Manager {
	void work() {
		System.out.println("HR is working");
	}
}

public class Inheritance extends HR {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance i1= new Inheritance();
		i1.work();
		i1.work1();

	}

}
