package in.co.nmsworks.week1;

import java.util.Scanner;

/*
5) Write a program to Find Largest Among Three numbers using
if..else statement
 */
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1:: ");
        int num1 = sc.nextInt();

        System.out.println("Enter num2:: ");
        int num2 = sc.nextInt();

        System.out.println("Enter num3:: ");
        int num3 = sc.nextInt();

//        num1

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the greatest number");
        } else if (num1 == num2 && num1 > num3) {
            System.out.println(num1 + " is the greatest number");
        } else if (num1 == num3 && num1 > num2) {
            System.out.println(num1 + " is the greatest number");
        }
//num2
        if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the greatest number");
        } else if (num2 == num1 && num2 > num3) {
            System.out.println(num2 + " is the greatest number");
        } else if (num2 == num3 && num2 > num1) {
            System.out.println(num2 + " is the greatest number");
        }
//num3
        if (num3 > num2 && num3 > num1) {
            System.out.println(num3 + " is the greatest number");
        } else if (num3 == num1 && num3 > num2) {
            System.out.println(num3 + " is the greatest number");
        } else if (num3 == num2 && num3 > num1) {
            System.out.println(num3 + " is the greatest number");
        }
    }
}


