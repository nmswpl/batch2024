package in.co.nmsworks.week1;
import java.util.*;

/**
 * 1) Write a program to compute Quotient and Remainder in Java
 **/

public class Question1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the dividend:");
        int div=sc.nextInt();
        System.out.println("enter the divisor:");
        int d= sc.nextInt();
        System.out.println("Quotient=" + div/d);
        System.out.println("remainder=" + div%d);
    }
}
