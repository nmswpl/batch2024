package in.co.nmsworks.week1;
/***    Write a program to Multiply Two Floating-Point Numbers ***/
import java.util.Scanner;

public class Question2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a :");
        float a = sc.nextFloat();
        System.out.println("enter the value of b :");
        float b = sc.nextFloat();
        float c=a*b;
        System.out.println("The Result is :"+c);
    }
}
