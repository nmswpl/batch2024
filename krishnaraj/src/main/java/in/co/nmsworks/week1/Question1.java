package in.co.nmsworks.week1;
/***   write a program to compute quotent and remainder in java ***/

import java.util.Scanner;

public class Question1 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a or divident : ");
        int a=sc.nextInt();
        System.out.println("enter the value of b diviser: ");
        int b=sc.nextInt();
        int c=a/b;
        int d=a%b;
        System.out.println("Quotient="+c);
        System.out.println("Remainder="+d);


    }
}

