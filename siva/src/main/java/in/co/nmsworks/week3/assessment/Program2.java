package in.co.nmsworks.week3.assessment;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 2) Given an array of integers, Write a Program to count and print number of even elements in the array.
 */

public class Program2 {

    public static void main(String[] args) {
        int count=0;
        int[] evenNums;


        List<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);

        for (Integer num : nums) {

            count=count+num;
            if(num%2==0){
                System.out.print(num+" ");
            }


        }
        System.out.println("count value :: "+count);

    }
}
