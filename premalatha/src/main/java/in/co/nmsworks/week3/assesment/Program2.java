package in.co.nmsworks.week3.assesment;
/*
Given an array of integers, Write a Program to count and print number of even elements in the array.
 */

import java.util.Scanner;

public class Program2 {
    public void countEvenNumbers(){
        int[] array = {2,5,8,4,10,11,15,14};
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                System.out.println("Even elements : " + array[i]);
                count++;
            }
        }
        System.out.println("Count :" + count);
    }
}
























