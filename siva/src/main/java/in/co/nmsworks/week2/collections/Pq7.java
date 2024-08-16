package in.co.nmsworks.week2.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * 7. Write a Java program to search for an element in an array list.
 */

public class Pq7 {
    public void search(){
        List<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        System.out.println(nums.contains(3));
}
}