package in.co.nmsworks.week3.day4;

import java.util.Arrays;

/**
 * Write a program to find the second-largest number in an array.
 */

public class Training5 {
    public void printSecondLargest(int... inputArray){
        int secondMax = 0;
        int max = 1;
        for (int i : inputArray) {
            if (max < i){
                secondMax = max;
                max = i;
            }
        }
        System.out.println("Second Maximum of given Array "+ Arrays.toString(inputArray) +" is :: "+secondMax);
    }
}
