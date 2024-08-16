package in.co.nmsworks.week2;
/*
. Given an array of integer, Write a Program to find the largest element in the given
array.
For E.g Input : arr[] = {12, 3, 20, 14} Output : Largest element = 20
 */

import java.util.Scanner;

public class Te17 {
    public  void largenum(){


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of elements");
        int size = sc.nextInt();

        int array[] = new  int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int maxElement = array[0];

        for (int i = 1; i < array.length; i++) {
            if(array[i] > maxElement){
                maxElement  = array[i];
            }
        }

        System.out.println(maxElement + "\n");

    }
}
