package in.co.nmsworks.week2.collections;

import java.util.ArrayList;
import java.util.Collections;

/*

9. Write a Java program to print reverse elements in an array list.
 */
public class PQ9 {

    public void reverseList() {
        System.out.println("Q9.");
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(4);
        nums.add(3);
        nums.add(2);
        nums.add(1);
        System.out.println("Before Reversing::" + nums);
        int len = nums.size() - 1;

        System.out.println("After Reversing::");
        for (int i = 0; i < len; i++) {

            System.out.println(nums.get(len - i));

        }
    }

}
