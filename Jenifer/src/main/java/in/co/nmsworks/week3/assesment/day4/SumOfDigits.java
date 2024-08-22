package in.co.nmsworks.week3.assesment.day4;
// Write a program to find the sum of digits of a given integer.

public class SumOfDigits {
    public void digitSum(int number){
        int sum = 0;
        int result = 0;
        while (number != 0) {
            result = number % 10;
            sum += result;
            number = number / 10;
        }
        System.out.println("Sum of digits : " +sum);
    }
}
