package in.co.nmsworks.weekend;
// Factorial Program in Java.

import java.util.Scanner;

public class Qn24 {
    public void factorialOfNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial : " + factorial);
    }
}
