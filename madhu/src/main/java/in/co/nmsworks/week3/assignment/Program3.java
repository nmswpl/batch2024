package in.co.nmsworks.week3.assignment;

import java.util.HashSet;
import java.util.Set;

/*Write a program to find if a given number (less than 1000) is prime or not using Set.*/
public class Program3 {
    int count = 0;
    Set<Integer> prime = new HashSet<>();

    public void primeNumber(int num)
    {
        if (num == 2) {
            System.out.println("Prime");
        } else {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }

            }
        }if (count == 2) {
            System.out.println("Prime Number");
            prime.add(num);
            System.out.println(prime);
        }
        else {
            System.out.println("Not prime");
        }
    }
}
