package in.co.nmsworks.week3.assesment;
// Write a program to find if a given number (less than 1000) is prime or not using Set.

import java.util.HashSet;
import java.util.Set;

public class Program3 {
    Set<Integer> primes = new HashSet<>();

    public boolean isPrime(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

    public void printNum(){
        for (int i = 1; i <= 1000; i++) {
         boolean primeNum = isPrime(i);
            if (primeNum)
            {
                int num = i;
                primes.add(i);
            }
        }

        System.out.println(primes);
        System.out.println(primes.size());

        int[] array = {1, 14, 15, 46, 86, 53};
        for (int i = 0; i < array.length; i++) {
            if(primes.contains(array[i])){
                System.out.println(array[i]+ " is a prime number");
            }else {
                System.out.println(array[i]+ " is not a prime number");
            }
        }
    }
}