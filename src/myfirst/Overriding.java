package myfirst;

class Car{
	void speed() {
		System.out.println("Speed is very high");
	}
}
class Bike extends Car{
	@Override
	void speed() {
		System.out.println("Bike is Speeding");
	}
}
class Cycle extends Car{
	@Override
	void speed() {
		System.out.println("Cycle is runing");
	}
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car();
		Car c2=new Bike();
		Car c3=new Cycle();
		
		c1.speed();
		c2.speed();
		c3.speed();
		
	}

}
