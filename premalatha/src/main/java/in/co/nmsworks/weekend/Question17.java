package in.co.nmsworks.weekend;
/*
Given an array of integer, Write a Program to find the largest element in the given
array.
For E.g Input : arr[] = {12, 3, 20, 14} Output : Largest element = 20
 */

public class Question17 {
    public void largestElement(){
        int[] arr = {12, 3, 20, 14};
        int largeElement =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largeElement)
                largeElement=arr[i];
        }
        System.out.println("Large element = " + largeElement);
    }
}
