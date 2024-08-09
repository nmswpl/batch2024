package in.co.nmsworks.week1;

import java.util.Scanner;

/* Write a program to compute Quotient and Remainder in Java */
public class Question1 {
    public static void main(String[] arg){
        int a;
        int b;
        int x ;
        int y ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1:");
        x=scanner.nextInt();
        System.out.println("Enter num2:" );
        y=scanner.nextInt();
        a = x / y;
        b = x % y;

        System.out.println("Output:");
        System.out.println("Quotient="+a);
        System.out.println("Remainder=" + b);
        }
    }

