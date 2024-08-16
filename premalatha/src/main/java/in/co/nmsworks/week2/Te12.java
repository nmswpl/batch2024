package in.co.nmsworks.week2;
/*
Given an array of integers, Write a Program to print number of odd elements.
For E.g Input : arr[] = {32, 43, 4, 15} Output : Odd elements = 2 Reason : 43 & 15
are odd.
 */

import java.util.Scanner;

public class Te12 {
    public void oddElements() {
        Scanner sc  = new Scanner(System.in);
        int count =0;
        System.out.println("Enter the number of elements in Array:");
        int arraySize = sc.nextInt();
        int array[] = new int[arraySize];
        for (int i =0; i <arraySize;i++){
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < arraySize; i++) {
            if(array[i] % 2 == 1){
                count++;
            }
        }
        System.out.println(count);
        System.out.println("\n");
    }
}
