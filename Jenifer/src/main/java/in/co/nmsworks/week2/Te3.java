package in.co.nmsworks.week2;
/* 3. Write a program to multiply two arrays of same size element-by-element.
E.g : Input : arr1 = {2,4,1} arr2={3,5,7} Output : 6 20 7 */

import java.util.Scanner;

public class Te3 {
    public void arrMul(){
            int[] arr1 = {2, 4, 1};
            int[] arr2 = {3, 5, 7};

        if (arr1.length != arr2.length) {
                System.out.println("Arrays must be of the same size.");
                return;
            }

        for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i] * arr2[i] + " ");
            }
        }
    }

