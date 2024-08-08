package in.co.nmsworks.week1;

import java.util.Scanner;

/***
 * Write a program to Find Largest Among Three numbers using
 * if..else statement
 */

public class Question5 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=scan.nextInt();
        System.out.println("Enter the second number:");
        int b=scan.nextInt();
        System.out.println("Enter the third number:");
        int c=scan.nextInt();
        if(a>b){
            System.out.println("greater number is="+a);
        } else if (b>c) {
            System.out.println("greater number is="+b);

        } else if (c>a) {
            System.out.println("greater number is="+c);

        }
    }

}
