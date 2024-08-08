package in.co.nmsworks.week1;
/* Write a program to compute Quotient and Remainder in Java */

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number1 =");
        int a = scanner.nextInt();
        System.out.println("Enter a number2 =");
        int b = scanner.nextInt();
        int quotient = a / b;
        int remainder = a % b;
        System.out.println("Quotient =" +quotient);
        System.out.println("Remainder=" +remainder);


    }
}

