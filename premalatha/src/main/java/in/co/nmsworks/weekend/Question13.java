package in.co.nmsworks.weekend;
/*
Given an array of integers, Write a Program to find the sum of the elements of the
array.
For E.g Input : arr[] = {1, 2, 3} Output : 6 Reason : 1 + 2 + 3 = 6
 */

public class Question13 {
    public void sumOfArray(){
        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Sum of elements in array = " + arr[i]+arr[i]);
        }
    }
}
