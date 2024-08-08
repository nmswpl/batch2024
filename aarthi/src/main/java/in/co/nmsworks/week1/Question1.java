package in.co.nmsworks.week1;
import java.util.Scanner;



/**
 * Write a program to compute Quotient and Remainder in Java
 */
public class Question1 {
    public static void main(String[] args)
    {
        System.out.println("Enter the number1");
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Enter the number2");
        int b = scanner.nextInt();
        int quotient= a/b;
        int remainder=a%b;
        System.out.println("Quotient= "+quotient);
        System.out.println("Remainder= "+remainder);
    }
}
