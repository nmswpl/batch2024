package in.co.nmsworks.week3.assesment;
// Given an array of integers, Write a Program to count and print number of even elements in the array.

import java.util.Scanner;

public class Program2 {
    public void printEvenElement() {

        int[] array = {1, 2, 4, 6, 7, 8};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                count++;
            }
        }
        System.out.println("Number of even element : " + count);
    }
}
