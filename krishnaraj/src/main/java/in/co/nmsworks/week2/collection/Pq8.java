package in.co.nmsworks.week2.collection;
import java.util.ArrayList;
import java.util.List;
/**
 * Write a Java program to print reverse elements in an array list.
 */
public class Pq8 {
    public void reverseArrayList() {
        List<Integer> numbers = new ArrayList<>(5);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("The old array :" +numbers);
        System.out.print("The reversed array : ");
        for (int i = numbers.size()-1; i >=0 ; i--) {
            System.out.print(" "+numbers.get(i));
        }
    }

}
