package in.co.nmsworks.week3.day4;
/*
Write a program to find the sum of digits of a given integer.
 */

public class Problem3 {
    public void sumOfIntegers(int a){
        int sum = 0;
        while(a > 0) {
            sum = a % 10;
            a = a / 10;
        }
        System.out.println("Sum of Integers = " + sum);
    }
}
