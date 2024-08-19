package in.co.nmsworks.week2;
/*
Given an integer x, Write a Program to check whether x is Prime or not ?
E.g (1) Input: x = 7; Output: Prime E.g (2) Input: x = 10; Output: Not Prime
 */

public class Question20 {
    public static void main(String[] args) {
        int x = 7;
        boolean isPrime = isPrime(x);
        if (isPrime) {
            System.out.println(x + " is Prime");
        } else {
            System.out.println(x + " is Not Prime");
        }
    }
    public static boolean isPrime(int x) {
        if (x <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
