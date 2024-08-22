package in.co.nmsworks.week3.day4;

import java.util.Arrays;

/**
 * Implement the algorithm to find the min and max elements in an array of integers.
 */

public class Training4 {
    public void printMinMaxOfArray(int... input){
        int min = 10000;
        int max = 0;
        for (int i : input) {
            if (min > i){
                min = i ;
            }
            if (max < i){
                max = i;
            }
        }
        System.out.println("In given Array "+ Arrays.toString(input) +" --> Minimum number is : "+min+" & Maximum number is :"+max);
    }
}
