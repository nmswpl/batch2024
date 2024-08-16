package in.co.nmsworks.week2.collection;

import java.util.ArrayList;
import java.util.List;

/***
 * Write a Java program to compare two array lists
 */
public class Pq10 {
    public void compareTwoArray() {
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
        if(numbers1.size()==numbers2.size()){
            if(numbers1.containsAll(numbers2)){
                System.out.println("Both array are have same size and values");
            }
        }else{
            System.out.println("Both are not equal");
        }
    }
}
