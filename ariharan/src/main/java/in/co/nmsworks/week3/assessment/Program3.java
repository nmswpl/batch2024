package in.co.nmsworks.week3.assessment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program3 {
    public void isPrime() {
        int value;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter the number to check whether is prime or not:");
            value = sc.nextInt();
            primeOrnot(value);
        } while (value >0);
    }

    private void primeOrnot(int value) {
        Set<Integer> primes = new HashSet<>();
        primes.add(2);
        for (int i = 2; i < 1000; i++) {
            if (addPrimesToSet(i) == 1) {
                primes.add(i);
            }
        }
        if (primes.contains(value)){
            System.out.println("it is prime number");
        }
        else {
            System.out.println("it is a not a prime");
        }

    }

    private int addPrimesToSet(int val) {
        if (val == 0) {
            return -1;
        } else if (val == 1) {
            return -1;
        }
        for (int i = 2; i < val; i++) {
            if (val % i == 0) {
                return 0;
            }


        }
        return 1;
    }
}
