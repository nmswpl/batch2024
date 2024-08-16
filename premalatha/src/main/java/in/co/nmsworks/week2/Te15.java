package in.co.nmsworks.week2;
/*
Given an array of integers, Write a Program to count and print even elements.
For E.g Input : arr[] = {2, 3, 4, 5, 6} Output : even elements = 3
Reason : 2 4 & 6 are even
 */

import java.util.Scanner;

public class Te15 {
    public void evenOrOdd() {
        int count =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements:");
        int number = sc.nextInt();

        int[] array = new int[number];

        for(int i = 0; i<number;i++){
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                count++;
                System.out.println(array[i]);
            }
        }

        System.out.println(count+"\n");
    }
}

