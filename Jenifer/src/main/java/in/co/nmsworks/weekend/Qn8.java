package in.co.nmsworks.weekend;
/* Given a 3 digit number, write a program to print the hundred position value in words.
E.g 1: Input : 542 Output : Five.
E.g 2: Input : 777 Output : Seven. */

import java.util.Scanner;

public class Qn8 {
    public void printHunPos(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 3 digit number : ");
        int number = scanner.nextInt();
        int hundredPos = number/100;
        String[] word = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        System.out.println("The Hundred position is " +word[hundredPos]);
    }
}
