package in.co.nmsworks.weekend;
/*
Given an array of integer, Write a Program to find the largest element in the given
array.
For E.g Input : arr[] = {12, 3, 20, 14} output:largest number 20
 */

public class Q6 {
    int[] arr={12,3,20,14};
    int max=arr[0];
    public void larelement(){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }System.out.println("Largest element = " + max);



    }
}
