package in.co.nmsworks.week2;
/*
Write a program to print the biggest of the 3 numbers
E.g : Input : 12, 24, 5 Output : 24 ; Input2 : 18, 18, 35 Output : 35
 */

import java.util.Scanner;

public class Te11 {
    public void number()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("num1 = ");
        int num1=scan.nextInt();
        Scanner scan1=new Scanner(System.in);
        System.out.println("num2 = ");
        int num2=scan.nextInt();
        Scanner scan3=new Scanner(System.in);
        System.out.println("num3 = ");
        int num3=scan.nextInt();
        if(num1>num2 && num1>num3)
            System.out.println("The num is "  +num1);
        else if (num2>num1 && num2> num3)
                System.out.println("The num is "  +num2);
        else if (num3>num1 && num3> num2)
            System.out.println("The num is "  +num3);

        }

    }

