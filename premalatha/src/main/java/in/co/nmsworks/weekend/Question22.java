package in.co.nmsworks.weekend;

import java.util.Scanner;

/**
 * Write a program to Multiply Two Floating-Point Numbers
 * The Result is: 3.0
 **/

public class Question22 {
    public  void multiplyFloat() {
        Scanner num1 = new Scanner(System.in);
        System.out.println("enter a number1 : :");
        float a= num1.nextFloat();
        Scanner num2 = new Scanner(System.in);
        System.out.println("enter a number2 : :");
        float b= num2.nextFloat();

        System.out.println("The result is :" + a * b);
    }
}
