package map.examples;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        Map<Integer,String> map1 = new HashMap<>();

        map1.put(107,"Guava");
        map1.put(105,"Mango");
        map1.put(101,"Apple");
        map1.put(108,"Orange");
        map1.put(106,"Watermelon");
        map1.put(104,"Banana");
        map1.put(102,"Apple");
        map1.put(101,"Grapes"); // old value for key 101 will be removed and new value will be added

        System.out.println("map1 is : "+map1);

        map1.remove(101);
        System.out.println("map1 after 101 key removal : "+map1);

        System.out.println("traverse using foreach loop");
        for (Map.Entry m1 : map1.entrySet()){
            System.out.println(m1.getKey()+"---"+m1.getValue());
        }
    }
}
