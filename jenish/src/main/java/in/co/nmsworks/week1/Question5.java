package in.co.nmsworks.week1;

import com.mysql.cj.xdevapi.DeleteStatementImpl;

import java.util.Scanner;

/**
 * Largest of three numbers
 * **/

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();

        System.out.println("Enter number 3: ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("Number " +num1+ " is the largest number");
        }
        else if(num1 == num2 || num1 == num3){
            System.out.println("Number "+num1+" is the largest number");
        }
        else if (num2 > num3) {
            System.out.println("Number "+num2+" is the largest number");
        }
        else if(num2 == num3){
            System.out.println("Number "+num2+" is the largest number");
        }
        else {
            System.out.println("Number "+num3+" is the largest number");
        }
        }
    }