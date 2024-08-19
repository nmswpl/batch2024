package in.co.nmsworks.week3.assessment;
import jdk.nashorn.internal.parser.Scanner;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
/*
Write a program to find if a given number (less than 1000) is prime or not using Set.
 */

public class Program2 {

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
        public void primeNum(){
            for (int i = 1; i <= 1000 ; i++) {
                boolean primeNum = isPrime(i);
                if(primeNum){
                    int num = i;
                    primes.add(i);
                }

            }
            System.out.println(primes);
            System.out.println(primes.size());

            int[] array = {2,78,89,57};
            for (int i = 0; i <array.length ; i++) {
                if(primes.contains(array[i])) {
                    System.out.println(array[i] + " is a prime number");
                }else {
                    System.out.println(array[i] + " is not a prime number");
                }
            }
    }
}



