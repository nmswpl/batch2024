package in.co.nmsworks.weekend;

import java.util.Scanner; /**
 * Write a program to compute Quotient and Remainder in Java
 * Output:
 * Quotient=6
 * Remainder=1
 **/
public class Question21 {
    public  void quotientAndRemainder(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number 1 :: ");
        int a = scan.nextInt();
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter Number 2 :: ");
        int b = scan.nextInt();

        System.out.println("Quotient = " + a / b);

        System.out.println("Reminder = " + a % b);

}
}