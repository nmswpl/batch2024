package in.co.nmsworks.weekend;

import java.util.Scanner;

/**
 * Factorial Program in Java
 **/
public class Question24 {
    public  void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number1 : :");
        int a = scanner.nextInt();

        int i, n =1;

        for (i = a; i >= 1; i--) {

            n = i * n;
        }
        System.out.println(n);
    }
}
