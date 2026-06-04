package CollectionFramwork;
import java.util.HashSet;
import java.util.Set;
public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<>();
		
		set.add(null);
		set.add("Pranav");
		set.add("Pranav");
		set.add("Ram");
		set.add("Yash");
		set.add("Om");
		
		System.out.println(set);
	}

}
