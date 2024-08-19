package in.co.nmsworks.weekend;

import java.util.Scanner;

/*
Write a program to print the biggest of the 3 numbers
E.g : Input : 12, 24, 5 Output : 24 ; Input2 : 18, 18, 35 Output : 35
 */
public class Question11 {
    public void biggest(){
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the num1 = ");
        int a = scan1.nextInt();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter the num2 = ");
        int b = scan2.nextInt();
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Enter the num3 = ");
        int c = scan3.nextInt();

        if(a>b && a>c)
            System.out.println("The biggest number is " + a);
        else if (b>a && b>c )
            System.out.println("The biggest number is " + b);
        else if (c>a && c>b)
            System.out.println("The biggest number is " + c);
    }
}
