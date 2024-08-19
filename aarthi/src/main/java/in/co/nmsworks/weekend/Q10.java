package in.co.nmsworks.weekend;
/*
Given an array of integers, Write a Program to find the sum of the elements of the
array.
For E.g Input : arr[] = {1, 2, 3} Output : 6 Reason : 1 + 2 + 3 = 6
 */

public class Q10 {
    int[] arr={1,2,3};
    int sum=0;
    public void sum(){
        for (int i = 0; i < arr.length; i++) {
            sum=arr[i]+sum;

        }System.out.println("The sum of the array = " +sum);
    }

}
