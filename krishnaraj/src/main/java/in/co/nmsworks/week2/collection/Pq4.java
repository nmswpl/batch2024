package in.co.nmsworks.week2.collection;
/***
 * Write a Java program to retrieve an element (at a specified index) from a given array list.
 */
import java.util.ArrayList;
import java.util.List;
public class Pq4 {
    public void retriveElement() {
        List<Integer> numbers = new ArrayList<>(5);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("Retrive the element specified index(3) : "+numbers.get(2));
    }
}
