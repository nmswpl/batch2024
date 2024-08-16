package in.co.nmsworks.week2;
/*
Given a 3 digit number, write a program to print the hundred position value in words.
E.g 1: Input : 542 Output : Five.
E.g 2: Input : 777 Output : Seven.
 */

import java.util.Scanner;

public class Te8 {
        public void position(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Number");
            int number = sc.nextInt();
            System.out.println(number / 100 + "\n");
        }
}
