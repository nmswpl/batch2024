package in.co.nmsworks.week2.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * 3. Write a Java program to insert an element into the array list at the first position.
 */

public class Pq3 {

    public void insertAnElement(){
        List<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        System.out.println("Before Add :: "+nums);
        nums.add(0,0);
        System.out.println("After Add::"+nums);
        System.out.println("Before Set ::"+nums);
        nums.set(0,6);
        System.out.println("After Set ::"+nums);
    }
}
