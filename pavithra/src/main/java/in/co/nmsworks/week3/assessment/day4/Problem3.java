package in.co.nmsworks.week3.assessment.day4;

/**
 * Write a program to find the sum of digits of a given integer.
 */

public class Problem3 {
    public void sumOfDigits(int num) {
        int sum = 0;
        int i = 0;
        while(i < num) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("The sum of digits " + sum);
    }
}
