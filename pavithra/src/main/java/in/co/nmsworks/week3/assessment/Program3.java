package in.co.nmsworks.week3.assessment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Write a program to find if a given number (less than 1000) is prime or not using Set.
 */

public class Program3 {

    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();

    public void prime() {
        Set<Integer> nums = new HashSet<>();
        nums.add(2);
        for (int i = 3; i < 1000; i++) {
            for (int j = 3; j <= Math.sqrt(num); j++) {
                if (num % i == 0) {
                    nums.add(i);
                    nums.add(num / i);
                    System.out.println("Prime");
                }
            }
        }
        System.out.println("not prime");
    }
}
