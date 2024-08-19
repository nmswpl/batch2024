package in.co.nmsworks.weekend;
// Write a program to Find Largest Among Three numbers using if..else statement.

import java.util.Scanner;

public class Qn25 {
    public void largest(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int number1 = scanner.nextInt();
        System.out.println("Enter number 2 : ");
        int number2 = scanner.nextInt();
        System.out.println("Enter number 3 : ");
        int number3 = scanner.nextInt();
        if (number1 > number2 && number1 > number3){
            System.out.println(number1 + " is largest number.");
        }else if (number2 > number1 && number2 > number3){
            System.out.println(number2 + " is largest number.");
        }else if (number3 > number1 && number3 > number2){
            System.out.println(number3 + " is largest number.");
        }else {
            System.out.println("All are equal.");
        }
    }
}
