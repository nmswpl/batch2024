package in.co.nmsworks.week1;
/*Java Basic Programs
1) Write a program to compute Quotient and Remainder in Java

 */

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        int n,m;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the dividend : ");
        n=in.nextInt();
        System.out.println("Enter the Divisor : ");
        m=in.nextInt();
        int q,r;
        q=n/m;
        r=n%m;
        System.out.println("Quotient  = "+q);
        System.out.println("Remainder = "+r);
    }
}
