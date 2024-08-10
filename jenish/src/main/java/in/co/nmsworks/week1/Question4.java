package in.co.nmsworks.week1;

import java.util.Scanner;

/**
 * Factorial of a number
 * **/

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int num = sc.nextInt();
        int result = num;

        for (int i = num - 1; i > 0 ; i--) {
            result *= i;
        }
        System.out.println("Factorial of number : " +result);
    }
}