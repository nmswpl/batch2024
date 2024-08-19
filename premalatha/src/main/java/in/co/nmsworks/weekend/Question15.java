package in.co.nmsworks.weekend;
/*
Given an array of integers, Write a Program to count and print even elements.
For E.g Input : arr[] = {2, 3, 4, 5, 6} Output : even elements = 3
Reason : 2 4 & 6 are even
 */

public class Question15 {
    public void countEvenNumbers(){
        int[] arr = {2, 3, 4, 5, 6};
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0)
                count++;
        }
        System.out.println("Count of even numbers = " + count);
    }
}
