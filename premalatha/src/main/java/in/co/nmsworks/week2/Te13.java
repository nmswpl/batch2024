package in.co.nmsworks.week2;
/*
Given an array of integers, Write a Program to find the sum of the elements of the
array.
For E.g Input : arr[] = {1, 2, 3} Output : 6 Reason : 1 + 2 + 3 = 6
 */

import java.util.Scanner;

public class Te13 {
    public void elementsInArray() {
        int sum =0;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number of elements in Array:");
        int arraySize = sc.nextInt();
        int array[] = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {

            array[i] = sc.nextInt();
        }

        for (int i = 0; i < arraySize; i++) {
            sum = sum + array[i];
        }

        System.out.println(sum + "\n");
    }
}
