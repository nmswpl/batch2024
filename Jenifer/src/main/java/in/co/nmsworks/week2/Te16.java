package in.co.nmsworks.week2;
/* Write a program using Recursion to find and print the factorial of a number.
For E.g Input : 5 Output : 120 Reason : 5 x 4 x 3 x 2 x 1 = 120 */

import java.util.Scanner;

public class Te16 {
    Scanner scanner = new Scanner(System.in);
    public void factorial() {
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();
        int num = 1;
        for (int i = 1; i <= number; i++) {
            num = num * i;
        }   System.out.println("Factorial of " + number + " is: " + num);
    }
}
