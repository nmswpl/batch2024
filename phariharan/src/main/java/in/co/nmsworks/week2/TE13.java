package in.co.nmsworks.week2;

/**
 * Given an array of integers, Write a Program to find the sum of the elements of the
 * array.
 * For E.g Input : arr[] = {1, 2, 3} Output : 6 Reason : 1 + 2 + 3 = 6
 */

public class TE13 {
    public int sumOfElementsInArray(int[] arr2){
        int sum = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum = sum + arr2[i];
        }
        return sum;
    }
}
