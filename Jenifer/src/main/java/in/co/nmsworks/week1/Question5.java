package in.co.nmsworks.week1;

import java.util.Scanner;

/* Write a program to Find Largest Among Three numbers using if..else statement */
public class Question5 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1:");
        int a = scanner.nextInt();
        System.out.println("Enter num2:");
        int b = scanner.nextInt();
        System.out.println("Enter num3:");
        int c = scanner.nextInt();
        if (a > b && a > c) {
            System.out.println("a is the largest number");
        } else if (b > a && b > c) {
            System.out.println("b is the largest number");
        } else if (c > a && c > b) {
            System.out.println("c is the largest number");
        } else {
            System.out.println("All are equal");
        }
    }
}
