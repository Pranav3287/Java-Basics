package Oopsconcepts;
class Method {

private String name;
private int RollNo;
private String StudentAdd;

public void setName(String Name) {
	this.name=Name;
}
public void setRollNo(int RollNo) {
	this.RollNo=RollNo;
}
public void setStudentAdd(String StudentAdd1) {
	this.StudentAdd=StudentAdd1;
}
public String getName() {
	return name;
}
public int getRollNo() {
	return RollNo;
}
public String getStudentAdd1() {
	return StudentAdd;
}
}
public class EncapsulationDemo {
	public static void main(String args[]) {
		Method m1=new Method();
		m1.setName("Pranav");
		m1.setRollNo(1);
		m1.setStudentAdd("Ram nager Kolhapur");
		
		System.out.println("Name is:"+m1.getName());
		System.out.println("Roll No. is:"+m1.getRollNo());
		System.out.println("Address is:"+m1.getStudentAdd1());
	}
}
