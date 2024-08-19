package in.co.nmsworks.week3.assesment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Write a program to find if a given number (less than 1000) is prime or not using Set.
 */

public class Runner3 {

    public static void main(String[] args)
    {
        Runner3 runner = new Runner3();
        Set<Integer> primeNumbers = runner.computePrimeNumber();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the number :: ");
            int number = sc.nextInt();
            if (number == -1) {
                break;
            } else {
                if (primeNumbers.contains(number)) {
                    System.out.println("Given number " + number + " is a prime !!");
                } else {
                    System.out.println("Given number " + number + " is not a prime !!");
                }
            }
        }
    }


    public Set<Integer> computePrimeNumber() {
        Set<Integer> primeSet = new HashSet<>();
        for (int numbers = 2; numbers < 1000; numbers++) {
            boolean isPrime1 = true;
            for (int i = 2; i <= numbers / 2; i++) {
                if (numbers % i == 0) {
                    isPrime1 = false;
                    break;
                }
            }
            if (isPrime1) {
                primeSet.add(numbers);
            }
        }
        return primeSet;
    }
}
