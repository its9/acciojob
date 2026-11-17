package collections.examples.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {

        // declaring list
        List<Integer> list1 = new LinkedList<>(); // [12,-34,0,null,12,10,-33-23,34]

        // to store multiple kind of data in single list
        List<?> list2 = new LinkedList<>(); // [12,-13,0,null,"Hello",'h',false,5.67f,6.723]
        List<Object> list3 = new LinkedList<>(); // [12,-13,0,null,"Hello",'h',false,5.67f,6.723]


        // adding data
        list1.add(45);
        list1.add(-34);
        list1.add(90);
        list1.add(22);
        list1.add(0);
        //list1.add(null);
        list1.add(45);
        // list1.add(null);
        list1.add(22);
        list1.add(17);
        list1.add(-12);

        System.out.println("list1 is : "+list1);

        // remove data
        list1.remove(5);
        System.out.println("list1 after removing 5th index : "+list1);

        //size
        System.out.println("list1 length/size is : "+list1.size());

        //search
        System.out.println("list1 3rd index data is : "+list1.get(3));
        System.out.println("list1 0th index data is : "+list1.get(0));

        //sort
        Collections.sort(list1); // sorts in ascending order
        System.out.println("list1 in ascending order is : "+list1);
        Collections.sort(list1, Collections.reverseOrder()); // sorts in descending order
        System.out.println("list1 in descending order is : "+list1);

        // traverse using foreach loop
        System.out.println("traverse using foreach loop");
        for(Integer l1:list1){
            System.out.println(l1);
        }
    }
}
