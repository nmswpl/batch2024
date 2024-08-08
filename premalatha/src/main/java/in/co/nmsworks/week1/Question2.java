package in.co.nmsworks.week1;

import java.util.Scanner;

/**
 * Write a program to Multiply Two Floating-Point Numbers
 * The Result is: 3.0
 **/

public class Question2 {
    public static void main(String[] arg) {
        Scanner num1 = new Scanner(System.in);
        System.out.println("enter a number1 : :");
        float a= num1.nextFloat();
        System.out.println("enter a number2 : :");
        float b= num1.nextFloat();

        System.out.println("The result is :" + a * b);
    }
}
