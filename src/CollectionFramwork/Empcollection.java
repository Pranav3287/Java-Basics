package CollectionFramwork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Empcollection {
	int EmpID;
	String EmpName;
	int salary;
	String Dep;
	
	Empcollection(int EmpID,String EmpName,int salary,String Dep){
		this.Dep=Dep;
		this.EmpID=EmpID;
		this.EmpName=EmpName;
		this.salary=salary;
	}
	
	
	public static void main(String[] args) {
		
		Empcollection e1=new Empcollection(101,"Pranav",20000,"CSE");
		Empcollection e2=new Empcollection(102,"yash",20000,"CSE");
		Empcollection e3=new Empcollection(103,"Om",20000,"maech");
		Empcollection e4=new Empcollection(104,"patil",20000,"CSE");
		Empcollection e5=new Empcollection(105,"Parit",6000,"ECE");
		Empcollection e6=new Empcollection(106,"yedage",4000,"Civil");
		ArrayList<Empcollection> list1=new ArrayList<>();
		
		list1.add(e1);
		list1.add(e2);
		list1.add(e3);
		list1.add(e4);
		list1.add(e5);
		list1.add(e6);
		
		//list1.remove(1);
		
		Iterator<Empcollection> i1= list1.iterator();
		while(i1.hasNext()) {
			Empcollection b1=(Empcollection)i1.next();
			System.out.println("Emp Name is :"+b1.EmpName+" Emp ID :"
			+b1.EmpID+" Emp salary :"+b1.salary+" Emp Deparatment :"+b1.Dep);
		}
		
		/*Scanner sc= new Scanner(System.in);
		System.out.println("Enter ID of the Emp :");
		int search=sc.nextInt();
		
		if(list1.contains(search)) {
			Empcollection b1=(Empcollection)i1.next();
			System.out.println("Emp Name is :"+b1.EmpName+"Emp ID :"
					+b1.EmpID+"Emp salary :"+b1.salary+"Emp Deparatment :"+b1.Dep);
		}else {
			System.out.println("The Emp is not Exist....");
		}*/
	}

}
