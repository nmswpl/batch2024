package in.co.nmsworks.weekend;
/* Given an integer x, Write a Program to check whether x is Prime or not ?
E.g (1) Input: x = 7; Output: Prime E.g (2) Input: x = 10; Output: Not Prime */

import java.util.Scanner;

public class Qn20 {
    public void primeNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();
        int count = 0;
        if (number > 1){
            for (int i = 1; i <= number ; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count == 2){
                System.out.println(number + " is prime number.");
            }
            else {
                System.out.println(number + " is not a prime number");
            }
        }
        else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
