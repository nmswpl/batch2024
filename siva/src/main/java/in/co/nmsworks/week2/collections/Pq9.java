package in.co.nmsworks.week2.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * 9. Write a Java program to print reverse elements in an array list.
 */
public class Pq9 {

    public void reverseElements(){
        List<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        for (int i = nums.size()-1; i >=0 ; i--) {

            System.out.println(nums.get(i));

        }
    }
}
