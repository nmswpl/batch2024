package in.co.nmsworks.week2;

import java.util.Arrays;

public class Te14 {
    /* 14. Given an array of String, Write a Program to reverse the array and print.
     For E.g Input : arr[] = {a, b, c} Output : arr[] = {c, b, a}
 */
    public void reverseArray(String[] arr) {
        int end= arr.length-1;
        int start=0;
        while (start<end){
            String temp  = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
