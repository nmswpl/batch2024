package in.co.nmsworks.week3.assessment.day4;

/**
 * Write a program to find the mean of an array.
 * The mean is the result of dividing the sum of the elements by the number of elements.
 */

public class Problem8 {
    public void meanFind(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
         int mean = sum / arr.length;
        System.out.println("Mean value of the array elements is : " + mean);
    }
}

