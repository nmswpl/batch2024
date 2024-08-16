package in.co.nmsworks.week2.collection;
/***
 * Write a Java program to update an array element by the given element.
 */
import java.util.ArrayList;
import java.util.List;
public class Pq5 {
    public void updateArrayt(int number) {
        List<Integer> numbers = new ArrayList<>(5);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("Old arrayList update a element : "+numbers);
        numbers.set(0,9);
        System.out.println("New array : "+numbers);
    }
}
