package in.co.nmsworks.week3.assesment;

import java.util.HashSet;
import java.util.Set;

/*
Write a program to find if a given number (less than 1000) is prime or not using Set.
 */

public class Question3 {
    Set<Integer> numbers = new HashSet<>();

    public boolean primeOrNot(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public void computePrimes(int num) {
        for (int i = 2; i <= 1000; i++) {
            if (primeOrNot(i)) {
                numbers.add(i);
            }
        }
        if(numbers.contains(num)){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is not a prime number");
        }
    }
}