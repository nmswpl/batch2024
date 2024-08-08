package in.co.nmsworks.week1;

import java.util.Scanner;

/**
 * Write a program to Find Largest Among Three numbers using
 * if..else statement
 **/

public class Question5 {
    public static void main(String[] args)
    {

        Scanner num1 = new Scanner(System.in);
        System.out.println("enter a number1 : :");
        int a = num1.nextInt();
        Scanner num2 = new Scanner(System.in);
        System.out.println("enter a number2 : :");
        int b = num2.nextInt();
        Scanner num3 = new Scanner(System.in);
        System.out.println("enter a number3 : :");
        int c = num3.nextInt();
        if(a>b && a>c)
        {
            System.out.println(a);
        }
        else if (b>c && b>a)
        {
            System.out.println(b);
        }
        else if (c>a && c>b)
        {
            System.out.println(c);
        }
        else
            System.out.println(a);
    }


    }
