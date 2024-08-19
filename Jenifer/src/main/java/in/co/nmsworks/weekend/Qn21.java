package in.co.nmsworks.weekend;
/* Write a program to compute Quotient and Remainder in Java
Output:
Quotient=6
Remainder=1 */

import java.util.Scanner;

public class Qn21 {
    public void division(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter dividend : ");
        int dividend = scanner.nextInt();
        System.out.println("Enter divisor : ");
        int divisor = scanner.nextInt();
        System.out.println("Quotient : " + dividend / divisor);
        System.out.println("Remainder : " + dividend % divisor);
    }
}
