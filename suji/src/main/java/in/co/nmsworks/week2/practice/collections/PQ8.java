package in.co.nmsworks.week2.practice.collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/*








public class PQ8 {
    public static void main(String[] args) {
        ArrayList<Integer> values=new ArrayList<>();
        values.add(1);
        values.add(3);
        values.add(6);
        values.add(8);
        System.out.println("Before sorting ");
        for (int i = 0; i < values.size(); i++) {
            System.out.println(values.get(i));
        }
        System.out.println("After sorting ::  ");
        Collections.sort(values);
        for (int i = 0; i < values.size(); i++) {
          System.out.println(values.get(i));
        }
}
}
 */

import java.util.ArrayList;

public class PQ8 {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(3);
        values.add(6);
        values.add(8);

       System.out.println("Elements in an array list");

      ArrayList<Integer> numbers=new ArrayList<>(values);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        }
    }

