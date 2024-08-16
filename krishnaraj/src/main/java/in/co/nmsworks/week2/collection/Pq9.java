package in.co.nmsworks.week2.collection;

import java.util.ArrayList;
import java.util.List;

/***
 * Write a Java program to copy one array list into another.
 */
public class Pq9 {
    public void copyArrayList() {
        List<Integer> numbers = new ArrayList<>(5);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("the first array list : "+numbers);
        List<Integer> copiedNumbers = new ArrayList<>(numbers);
        System.out.println("copied array : "+numbers);
    }
}
