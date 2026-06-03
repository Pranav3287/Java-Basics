package Test;
import java.util.ArrayList;
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
        
        String b=list.get(2);
        System.out.println(b);
		
	}
}
