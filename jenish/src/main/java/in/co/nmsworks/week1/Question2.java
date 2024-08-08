package in.co.nmsworks.week1;

import java.util.Scanner;

/**
 * Multiply two floating point numbers
 * **/


public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1 :");
        float num1 = sc.nextFloat();

        System.out.println("Enter number 2 :");
        float num2 = sc.nextFloat();

        float result = num1 * num2;
        System.out.println("Result is : " +result);
    }
}
