package collections.examples.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        Set<Integer> set1 = new TreeSet<>();

        set1.add(56);
        set1.add(-67);
        set1.add(77);
        set1.add(12);
        set1.add(10);
        set1.add(34);
        set1.add(16);
        set1.add(56);

        System.out.println("set1 is : "+set1);

        set1.remove(10);
        System.out.println("set1 after removal is : "+set1);

        System.out.println("traverse using foreach loop");
        for (Integer s1:set1){
            System.out.println(s1);
        }
    }
}
