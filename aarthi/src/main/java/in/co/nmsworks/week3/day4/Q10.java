package in.co.nmsworks.week3.day4;
/*
Write a program to find the median of an array.
        If the number of elements is odd, the median is the middle element.
        If the number of elements is even, the median is the average of the two middle elements.
 */

public class Q10 {
    public void median(int...arr){
            int length = arr.length;
            if (length % 2 == 1) {
                System.out.println(arr[length / 2]);

            } else {
                int mid1 = length / 2 - 1;
                int mid2 = length / 2;
                int result = arr[mid1] +arr[mid2];
                System.out.println("The median of the array::  "+result/2);
            }
    }
}
