package in.co.nmsworks.week1;
import java.util.Scanner;

/**
 *Write a program to compute Quotient and Remainder in Java
 * Output:
 * Quotient=6
 * Remainder=1
 */

public class Question1 {

        public static void main(String[] args){


            Scanner scan=new Scanner(System.in);

            System.out.println("Enter num1:");
            int a=scan.nextInt();

            System.out.println("Enter num2:");
            int b=scan.nextInt();

            System.out.println("Quotient="+ a/b);

            System.out.println("Remainder="+ a%b);

        }
}
