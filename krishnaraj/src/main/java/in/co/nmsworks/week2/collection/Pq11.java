package in.co.nmsworks.week2.collection;
import java.util.ArrayList;
import java.util.List;
/**
 * Write a Java program to join two array lists.
 */
public class Pq11 {
    public void joinToArray() {
        List<Integer> numbers1 = new ArrayList<>(5);
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);
        List<Integer> numbers2 = new ArrayList<>(5);
        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(3);
        numbers2.add(4);
        numbers1.addAll(numbers2);
        System.out.println("array one : "+numbers1);
        System.out.println("array two : "+numbers2);
        System.out.println("Added arrary : "+numbers1);
    }
}
