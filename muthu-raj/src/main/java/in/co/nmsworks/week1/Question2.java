package in.co.nmsworks.week1;

/*
2) Write a program to Multiply Two Floating-Point Numbers
The Result is: 3.0
 */

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1:: ");
        float num1 = sc.nextFloat();

        System.out.println("Enter num2:: ");
        float num2 = sc.nextFloat();

        System.out.println("The Result is: " + (num1*num2));
    }
}
