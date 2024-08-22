package in.co.nmsworks.week3.day4;
/*
Problem-3: Write a program to find the sum of digits of a given integer.
 */
public class Program3 {

    public static void main(String[] args) {
        int i = 909;
        System.out.println(sumOfDigits(i));
    }

    private static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

}
