package in.co.nmsworks.week3.assesment;

import jdk.nashorn.internal.runtime.linker.LinkerCallSite;

import java.util.*;

/*
3) Write a program to find if a given number (less than 1000) is prime or not using Set.
 */
public class Program3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> primeNumbers = new HashSet<>();

        for (int i = 1; i < 1000; i++) {
            if (checkPrime(i)) {
                primeNumbers.add(i);
            }
        }


        System.out.println(primeNumbers);

        System.out.println("Enter a number::");
        int num = sc.nextInt();

        if (primeNumbers.contains(num)) {
            System.out.println("The number is a prime");
        }
        else {
            System.out.println("The number is not a prime");
        }
    }

    public static boolean checkPrime(int num) {

        for (int i = 2; i < Math.sqrt(num); i++) {

            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }
}
