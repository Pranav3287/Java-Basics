package Test;

class Emp{
	private String EmpName;
	private int EmpID;
	private double salary;
	
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String EmpName) {
		this.EmpName =EmpName;
	}
	public int getEmpID() {
		return EmpID;
	}
	public void setEmpID(int EmpID) {
		this.EmpID=EmpID;
	}
	public double getEmpsalary() {
		return salary;
	}
	public void setEmpsalary(int salary) {
		this.salary=salary;
	}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e=new Emp();
		e.setEmpName("Pranav");
		e.setEmpID(122);
		e.setEmpsalary(20000);
		
		System.out.println("Emp Name is:"+e.getEmpName());
		System.out.println("Emp ID is:"+e.getEmpID());
		System.out.println("Emp Salary is:"+e.getEmpsalary());
		
	}

}
