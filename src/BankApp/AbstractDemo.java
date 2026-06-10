package BankApp;
abstract class Demo{
	void set() {
		System.out.println("By Inheritance");
	}
	abstract void show();
}
public class AbstractDemo extends Demo {
	void show() {
		System.out.println("Abstract Method body...");
	}

	public static void main(String[] args) {
		AbstractDemo d1 = new AbstractDemo();
		d1.show();
		d1.set();
	}
}
