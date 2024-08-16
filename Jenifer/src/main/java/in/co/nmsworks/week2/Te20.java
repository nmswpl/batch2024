package in.co.nmsworks.week2;
/* Given an integer x, Write a Program to check whether x is Prime or not ?
E.g (1) Input: x = 7; Output: Prime E.g (2) Input: x = 10; Output: Not Prime */

import java.util.Scanner;

public class Te20 {
    public void primeNumber(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Number = ");
            int number = scanner.nextInt();
            if(number % 2 == 0)
                System.out.println("Not prime");
            else
                System.out.println("Prime");
    }
}
