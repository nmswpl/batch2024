package in.co.nmsworks.week3.assessment.day4;

/**
 * Problem-3: Write a program to find the sum of digits of a given integer
 */

public class Program3 {
    public static void main(String[] args) {
        Program3 program3 = new Program3();
        System.out.println("Sum of digits = "+program3.sumOfDigits(123));

    }
    public int sumOfDigits(int num){
        int sum = 0;
        while(num > 0){
            sum+=num%10;
            num = num/10;
        }
        return sum;
    }

}
