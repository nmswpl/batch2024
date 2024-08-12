package in.co.nmsworks.week2;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Write a program to print the biggest of the 3 numbers
 * E.g : Input : 12, 24, 5 Output : 24 ; Input2 : 18, 18, 35 Output : 35
 */

public class Question11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1=scan.nextInt();
        System.out.println("Enter the Second number: ");
        int num2=scan.nextInt();
        System.out.println("Enter the Third number: ");
        int num3=scan.nextInt();

        if(num1>num2){
            System.out.println("The biggest number is: "+num1);

        } else if (num2>num3) {
            System.out.println("The biggest number is: "+num2);

        }
        else {
            System.out.println("The biggest number is: "+num3);
        }

    }
}
