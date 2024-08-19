package in.co.nmsworks.weekend;
/*
Given an array of String, Write a Program to reverse the array and print.
For E.g Input : arr[] = {a, b, c} Output : arr[] = {c, b, a}
 */

public class Question14 {
    public void reverse(){
        char[] arr = {'a', 'b', 'c'};
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.println("Reverse of array = " + arr[i]);
        }
    }
}
