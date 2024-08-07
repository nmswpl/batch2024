package in.co.nmsworks.week1;

import java.util.Scanner;

/**
 * Program to print a quotient and remainder
 * **/

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Dividend :");
        int Dividend = sc.nextInt();

        System.out.println("Enter Divisor :");
        int Divisor = sc.nextInt();

        int quotient = (int) Dividend / Divisor;
        int remainder = Dividend % Divisor;

        System.out.println("Quotient : "+quotient);
        System.out.println("Remainder : "+remainder);
    }
}
