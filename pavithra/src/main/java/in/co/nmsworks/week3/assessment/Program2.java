package in.co.nmsworks.week3.assessment;
/**
 * Given an array of integers, Write a Program to count and print number of even elements in the array.
 */

import java.util.HashSet;
import java.util.Set;



public class Program2 {
    int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99, 102};

    int count = 0;

    public void evenCount() {
        Set<Integer> nums = new HashSet<>();

        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.println(i);
                nums.add(i);
                count++;


            }

        }
        System.out.println("Event count of array:" + count);


    }

}
