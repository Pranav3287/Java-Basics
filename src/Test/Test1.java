package Test;

class student{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name =name;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age=age;
	}
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1=new student();
		s1.setName("Pranav");
		s1.setage(24);
		
		System.out.println("Student Name is:"+s1.getName());
		System.out.println("Student age is:"+s1.getage());

	}
}
