package in.co.nmsworks.week2.collection;
import java.util.ArrayList;
import java.util.List;
/***
 * Write a Java program to search for an element in an array list.
 */
public class Pq7 {
    public void searchElement(int number) {
        List<Integer> numbers = new ArrayList<>(5);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("The array : "+numbers);
        if(numbers.contains(number)){
            System.out.println("The Element is present : " +number);
        }else{
            System.out.println("The element is not present : " +number);
        }
    }
}
