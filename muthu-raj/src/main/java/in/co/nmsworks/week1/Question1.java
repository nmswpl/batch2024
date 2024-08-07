package in.co.nmsworks.week1;

import java.util.Scanner;

/*1) Write a program to compute Quotient and Remainder in Java
Output:
Quotient=6
Remainder=1
 */
public class Question1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1:: ");
        int num1 = sc.nextInt();

        System.out.println("Enter num2:: ");
        int num2 = sc.nextInt();

        System.out.println("Quotient = " + (num1/num2));
        System.out.println("Remainder = "+ (num1%num2));
    }
}
