package in.co.nmsworks.week1;

import java.util.Scanner;

/**
 * Factorial Program in Java
 **/
public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a number1 : :");
        int a = scanner.nextInt();

        int i, fact =1;

        for (i = a; i >= 1; i--) {

            fact = i * fact;
        }
            System.out.println(fact);
    }
}
