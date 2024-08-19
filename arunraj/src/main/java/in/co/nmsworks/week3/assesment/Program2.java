package in.co.nmsworks.week3.assesment;

//2) Given an array of integers, Write a Program to count
// and print number of even elements in the array.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program2 {
    public void countPrintEven(){
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the Limit : ");
        n=in.nextInt();
        int[] evenArray = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the numbers : ");
            evenArray[i]=in.nextInt();
        }
        int count=0;
        for(int i : evenArray){
            if(i%2==0){
                System.out.print(i+" ");
                count++;
            }
            System.out.println();
        }
        System.out.println("The count of the even numbers is "+count);
    }
}
