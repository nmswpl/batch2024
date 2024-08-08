package in.co.nmsworks.week1;

import java.util.Scanner;

/**
 * Write a program to Multiply Two Floating-Point Numbers
 */

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number1 : ");
        float num1 = sc.nextFloat();
        System.out.println("Enter the number2 : ");
        float num2 = sc.nextFloat();
        float mul = num1 * num2;
        System.out.println("The Result is ::"+mul);
    }
}
