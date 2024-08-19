package in.co.nmsworks.weekend;

import java.util.Scanner;

/*
Given a 3 digit number, write a program to print the hundred position value in words.
E.g 1: Input : 542 Output : Five.
E.g 2: Input : 777 Output : Seven.
 */
public class Question8 {
    public void hundredPosition(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input = ");
        int num = scan.nextInt();

        System.out.println(num / 100 + "\n");

    }
}
