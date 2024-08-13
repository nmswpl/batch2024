package in.co.nmsworks.week2;

// Given an array of integers, Write a Program to count and print even elements.
//        For E.g Input : arr[] = {2, 3, 4, 5, 6} Output : even elements = 3
//        Reason : 2 4 & 6 are even


import java.util.Scanner;

class Te15 {
    public Te15() {
        int[]arr = {2, 3, 4, 5, 6} ;
        int c=0;
        for (int i = 0; i < 5; i++)
        {
            if(arr[i]%2==0)
            {
                c=c+1;
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println(" even elements = "+c);
    }
}
