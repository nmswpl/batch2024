package in.co.nmsworks.week1;

import java.util.Scanner;

/* Write a program to Multiply Two Floating-Point Numbers */
public class Question2 {
    public static void main (String[] arg){
        float x;
        float a;
        float b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1:");
        a=scanner.nextFloat();
        System.out.println("Enter num2:");
        b =scanner.nextFloat();
        x = a * b;

        System.out.println("The Result is : " + x);
    }
}
