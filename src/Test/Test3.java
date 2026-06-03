package Test;

abstract class shape{
	abstract double Area();
	
}
class Rectangle extends shape{
	private double length;
	private double width;
	
	public Rectangle(double length,double width) {
		this.length=length;
		this.width=width;
	}
	@Override
	double Area() {
		// TODO Auto-generated method stub
		return length * width;
	}
}
class Circle extends shape{
	private double raduis;
	public Circle(double raduis) {
		this.raduis=raduis;
	}
	double Area() {
		return Math.PI * raduis * raduis;
	}
}

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape myCircle = new Circle(5.0);
        shape myRectangle = new Rectangle(0.45,0.56);

        System.out.println("--- Calculating Areas ---");
        
        // Calling the overridden methods
        System.out.printf("Area of the Circle: %.2f\n", myCircle.Area());
        System.out.printf("Area of the Rectangle: %.2f\n", myRectangle.Area());

	}

}
