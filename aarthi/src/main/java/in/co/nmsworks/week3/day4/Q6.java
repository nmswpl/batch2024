package in.co.nmsworks.week3.day4;
/*
Write a program to find the second largest number in an array.
 */

public class Q6 {
    public void secondLargestNum(int... arr) {
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


