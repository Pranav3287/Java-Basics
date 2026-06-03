package Test;
import java.util.ArrayList;

public class ArrayIndex {

    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
        
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
        
        System.out.println("\n--- Inserting at 2nd position (Index 2) ---");
        
        list.add(2, "Ramu Yedage");

        System.out.println(list);
    }
}