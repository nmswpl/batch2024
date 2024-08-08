package in.co.nmsworks.week1;
import java.util.Scanner;

/**
 *  Write a program to compute Quotient and Remainder in Java
 */

public class Question1 {
    public static void main (String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("num for a");
        int a=scanner.nextInt();
        System.out.println("num for b");
        int b=scanner.nextInt();
        int quotient=b/a;
        int remainder=b%a;
        System.out.println("Quotient"+ "="+quotient);
        System.out.println("Remainder"+"="+remainder);


    }
}
