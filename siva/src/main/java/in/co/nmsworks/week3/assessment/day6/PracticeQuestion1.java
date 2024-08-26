package in.co.nmsworks.week3.assessment.day6;

import java.util.Scanner;

/**Write a program that takes an integer as input and prints whether the number is positive, negative, or zero.
 *
 */

public class PracticeQuestion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = scanner.nextInt();
        if(num>0){
            System.out.println("The num is positive");
        } else if (num<0) {
            System.out.println("The num is negative");

        }
        else {
            System.out.println("the num is Zero");
        }
    }
}
