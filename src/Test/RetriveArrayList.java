package Test;
import java.util.*;
import java.util.LinkedList;
public class RetriveArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list=new ArrayList<>();
		
		list.add("Pranav");
        list.add("Ram");
        list.add("Yash");
        list.add("Abhe");
        list.add("Om");
        list.add("Patil");
        list.add("Yedage");
        list.add("Parti");
        list.add("Game");
        
        System.out.println("--- Original List ---");
        System.out.println(list);
        
        String b=list.get(2);//retrive the 2nd element from the list
        System.out.println(b);
        
        List<Integer> list2=new LinkedList<>();
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);
        list2.add(70);
        list2.add(80);
        list2.add(90);
        list2.add(1000);
        
        System.out.println("---Original List---");
        System.out.println(list2);
        list2.remove(8);
        System.out.println(list2);
        
        
        
	}
}
