package in.co.nmsworks.week2.collection;
import java.util.ArrayList;
import java.util.List;
/**
 * Write a Java program to insert an element into the array list at the first position.
 */
public class Pq3 {
    public void insertFirst() {
        List<Integer> numbers = new ArrayList<>(5);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("Before insertion in array : "+numbers);
        numbers.add(0,5);
        System.out.println("After insertion element in first : " +numbers);
        numbers.set(0,10);
        System.out.println("After Seting an element in first : " +numbers);
    }
}
