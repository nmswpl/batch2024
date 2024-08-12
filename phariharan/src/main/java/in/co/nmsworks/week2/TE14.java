package in.co.nmsworks.week2;

/**
 * Given an array of String, Write a Program to reverse the array and print.
 * For E.g Input : arr[] = {a, b, c} Output : arr[] = {c, b, a}
 */

public class TE14 {
    public void reverseArray(int[] arr){
        int temp = 0 ;
        for (int i = 0; i <arr.length /2 ; i++) {
            temp = arr[i];
            arr[arr.length-1] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ,");
        };
    }
}
