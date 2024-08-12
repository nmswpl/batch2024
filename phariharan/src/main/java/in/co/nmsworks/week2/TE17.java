package in.co.nmsworks.week2;

/**
 * Given an array of integer, Write a Program to find the largest element in the given
 * array.
 * For E.g Input : arr[] = {12, 3, 20, 14} Output : Largest element = 20
 */

public class TE17 {
    public void LargestElement(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest element = " + largest);
    }
}
