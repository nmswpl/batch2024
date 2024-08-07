package in.co.nmsworks.week1;
import java.util.Scanner;
/* Write a program to compute Quotient and Remainder in Java
Output:
Quotient=6
Remainder=1
 */
public class Question1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter no.1:");
        int a = s.nextInt();

        System.out.println("Enter no.2");
        int b = s.nextInt();

        System.out.println("Quotient=" + a / b);

        System.out.println("Remainder=" + a % b);
    }
}
