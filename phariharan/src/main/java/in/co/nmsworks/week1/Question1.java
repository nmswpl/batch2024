package in.co.nmsworks.week1;

import java.util.Scanner;

/**
 * 1) Write a program to compute Quotient and Remainder in Java
 */

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number2 : ");
        int num2 = sc.nextInt();
        int quotient,value,remainder;

//        for (int i = 1; i < num1 ; i++) {
//            value = i*num2;
//            quotient = i;
//            if (value > num1){
//                break;
//            }
//        }
        quotient = num1/num2;;
        System.out.println("Quotient ::"+quotient);
        remainder = num1%num2;;
        System.out.println("Remainder :: " +remainder);
        }
    }


/**
 *  q = n1/n2;
 *  r=
 *
 */
