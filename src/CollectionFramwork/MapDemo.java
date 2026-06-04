package CollectionFramwork;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {
        Map<Integer, String> hm1 = new HashMap<>();

        Map<Integer, String> hm2 = new HashMap<>();

        hm1.put(1, "Pranav");
        hm1.put(2, "Ram");
        hm1.put(3, "Yash");

        hm2.put(1, "Pranav");
        hm2.put(2, "Ram");
        hm2.put(3, "Yash");

        System.out.println(hm1);
        System.out.println(hm2);
    }
}
