package in.co.nmsworks.week2.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * 6. Write a Java program to remove the third element from an array list.
 */

public class Pq6 {

    public void remove(){
        List<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.remove(2);
        System.out.println("Remove 3rd Element"+nums);
}
}