package in.co.nmsworks.week3.day4;

import java.util.Arrays;

/**
 * Write a program to find the median of an array.
 *         If the number of elements is odd, the median is the middle element.
 *         If the number of elements is even, the median is the average of the two middle elements.
 */

public class Training9 {
    public void findMedian(int... inputArray){
        float median = 0;
        Arrays.sort(inputArray);
        if(inputArray.length % 2 == 0){
            median = (float) (inputArray[inputArray.length/2]+inputArray[(inputArray.length/2)-1])/2;
            System.out.println("Median of given array "+ Arrays.toString(inputArray) +" is : "+median);
        }
        else{
            median = inputArray[inputArray.length/2];
            System.out.println("Median of given array "+ Arrays.toString(inputArray) +" is : "+(int)median);
        }
    }
}
