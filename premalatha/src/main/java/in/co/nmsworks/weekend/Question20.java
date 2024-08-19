package in.co.nmsworks.weekend;
/*
Given an integer x, Write a Program to check whether x is Prime or not ?
E.g (1) Input: x = 7; Output: Prime E.g (2) Input: x = 10; Output: Not Prime
 */

import java.util.Scanner;

public class Question20 {
    public void prime(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number =scan.nextInt();
        if (number <= 1 || number%2==0) {
            System.out.println("Not an prime");
            return;
        }
        if (number == 2) {
            System.out.println("this is an prime");
            return;
        }
        for (int i = 3; i <= number; i++) {
            if (number % i==0){
                System.out.println("not an prime");
                return;
            }
        }
        System.out.println("this is an prime number");
    }
}
