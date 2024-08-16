package in.co.nmsworks.week2.collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/***
 * Write a Java program to iterate through all elements in an array list.
 */
public class Pq2 {
    public void iterateArray() {
        List<Integer> numbers = new ArrayList<>(5);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("Iterating an arrary : ");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        Set<Integer> numbers2=new HashSet<>();
        for (int i = 0; i < numbers.size(); i++) {
            numbers2.add(numbers.get(i));
        }
        System.out.println("This is an array : ");
        for (Integer number: numbers2){
            System.out.println(number);
        }
    }

}
