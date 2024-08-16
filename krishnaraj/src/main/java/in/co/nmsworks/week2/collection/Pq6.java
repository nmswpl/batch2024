package in.co.nmsworks.week2.collection;
import java.util.ArrayList;
import java.util.List;
/**
 *  Write a Java program to remove the third element from an array list.
 */
public class Pq6 {
    public void removeThirdElement() {
        List<Integer> numbers = new ArrayList<>(5);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("Old arrayList for remove 3rd ele : "+numbers);
        numbers.remove(2);
        System.out.println("New array : "+numbers);
    }
}
