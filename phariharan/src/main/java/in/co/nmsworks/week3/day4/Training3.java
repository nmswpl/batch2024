package in.co.nmsworks.week3.day4;

/**
 * Write a program to find the sum of digits of a given integer.
 */

public class Training3 {
    public void sumOfDigit(int digit){
        int sum = 0;
        int givenInput = digit;
        while (digit > 0){
            sum += digit%10;
            digit /=10;
        }
        System.out.println("Sum of Digit "+givenInput+" is : "+sum);
    }
}
