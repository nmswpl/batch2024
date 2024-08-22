package in.co.nmsworks.week3.day4;
/*
 Write a program to find the sum of digits of a given integer.
 */

public class Q4 {
    public void sumNum(int num) {
        int sum = 0;
        int i = 0;
        while(i < num) {
            sum = sum + num % 10; // Add the last digit to the sum
            num = num / 10;
        }
        System.out.println("The sum of digits " + sum);
    }
}
