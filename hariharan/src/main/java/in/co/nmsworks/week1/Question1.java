package in.co.nmsworks.week1;

import java.util.Scanner;

// program to compute quotient

public class Question1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter number 1:");
        int x = sc.nextInt();

        System.out.println("Enter Number 2:");
        int y = sc.nextInt();

        System.out.println("quotient:"+ x/y + "Remainder:"+ x % y);
    }
}
