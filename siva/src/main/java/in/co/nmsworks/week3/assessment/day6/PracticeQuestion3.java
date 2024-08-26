package in.co.nmsworks.week3.assessment.day6;

import java.util.Scanner;

/**
 * Write a program that reads integers from the user until the user enters `0`, then prints the sum of all entered integers.
 */

public class PracticeQuestion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Enter the num");
            int num = scanner.nextInt();
            if(num == 0){
                break;
            }

        }


    }

}
