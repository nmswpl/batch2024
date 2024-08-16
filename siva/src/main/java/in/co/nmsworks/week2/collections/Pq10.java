package in.co.nmsworks.week2.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * 10. Write a Java program to compare two array lists.
 */

public class Pq10 {

    public void compare(){
        List<Integer> numList1=new ArrayList<>();
        numList1.add(1);
        numList1.add(2);
        numList1.add(3);
        numList1.add(5);
        numList1.add(4);
        List<Integer> numList2=new ArrayList<>();
        numList2.add(1);
        numList2.add(5);
        numList2.add(4);
        numList2.add(2);
        numList2.add(3);
        System.out.println(numList1.containsAll(numList2));
    }
}
