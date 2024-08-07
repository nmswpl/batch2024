package in.co.nmsworks.week1;

import java.util.Scanner;

/**
 *  Write a program to Find Largest Among Three numbers using if..else statement
 */

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number2 : ");
        int num2 = sc.nextInt();
        System.out.println("Enter the number3 : ");
        int num3 = sc.nextInt();

        if (num1 >= num2) {
            if (num2 >= num3 || num1 >= num3){
                System.out.println(num1+" is a bigger number");
            }
            else{
                System.out.println(num3+" is a bigger number");
            }
        } else if (num2 >=num3) {
            if (num3 >= num1 || num2 >= num1){
                System.out.println(num2+" is a bigger number");
            }
        }
        else {
            System.out.println(num3+" is a bigger number");
        }
    }
}
