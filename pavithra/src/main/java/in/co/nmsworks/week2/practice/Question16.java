package in.co.nmsworks.week2.practice;

import java.util.Scanner;

/**
 *Write a program using Recursion to find and print the factorial of a number.
 * For E.g Input : 5 Output : 120 Reason : 5 x 4 x 3 x 2 x 1 = 120
 */

public class Question16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }   System.out.println("Factorial of " + num + " is: " + factorial);
    }

}

