package in.co.nmsworks.week3.assessment.day4;

/**
 * Write a program to find the second largest number in an array.
 */

public class Problem5 {
    public void getSecondLargest(int... arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }System.out.println("Second Largest: " + secondLargest);
    }






}
