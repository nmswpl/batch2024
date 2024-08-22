package in.co.nmsworks.week3.day4;

import java.util.Arrays;

/**
 * Write a program to find the mean of an array.
 *         The mean is the result of dividing the sum of the elements by the number of elements.
 */

public class Training8 {
    public void findMean(int... inputArray){
        int sum = 0;
        for (int i : inputArray) {
            sum += i;
        }
        float mean = (float) sum /inputArray.length;
        System.out.println("Mean of given Array "+ Arrays.toString(inputArray) +" is : "+mean);
    }
}
