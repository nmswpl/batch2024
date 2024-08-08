package in.co.nmsworks.week1;

/*2) Write a program to Multiply Two Floating-Point Numbers*/

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        float n,m;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        n=in.nextFloat();
        System.out.println("Enter 2nd Number : ");
        m=in.nextFloat();
        float mul;
        mul=n*m;
        System.out.println("The Result is : "+mul);
    }
}
