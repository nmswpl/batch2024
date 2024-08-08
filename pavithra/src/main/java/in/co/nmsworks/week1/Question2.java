package in.co.nmsworks.week1;

import java.util.Scanner;

/**
 *Write a program to Multiply Two Floating-Point Numbers
 * The Result is: 3.0
 */

public class Question2 {

        public static void main(String[] args)
        {
            Scanner scan=new Scanner(System.in);

            System.out.println("Enter the num1=");
            float num1=scan.nextFloat();

            System.out.println("Enter the num2=");
            float num2=scan.nextFloat();

            System.out.println(num1*num2);
        }
}
