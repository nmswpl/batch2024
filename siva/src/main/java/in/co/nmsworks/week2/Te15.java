package in.co.nmsworks.week2;

/**
 * Given an array of integers, Write a Program to count and print even elements.
 * For E.g Input : arr[] = {2, 3, 4, 5, 6} Output : even elements = 3
 * Reason : 2 4 & 6 are even
 */

public class Te15 {
    int[] arr;
    public void countEven() {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        System.out.println("even elements = " + count);
    }
}
