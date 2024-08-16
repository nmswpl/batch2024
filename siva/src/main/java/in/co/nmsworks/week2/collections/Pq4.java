package in.co.nmsworks.week2.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * 4. Write a Java program to retrieve an element (at a specified index) from a given array list.
 */

public class Pq4 {
    public void retriveAnElement(){
        List<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        System.out.println("Retrieved Element :: "+nums.get(2));
    }
}
