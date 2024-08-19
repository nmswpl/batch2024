package in.co.nmsworks.week3.assessment;
/*3) Write a program to find if a given number (less than 1000) is prime or not using Set.*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/*3) Write a program to find if a given number (less than 1000) is prime or not using Set.*/
public class Question3 {
    Set<Integer> prime = new HashSet<>();

    public boolean isPrime(int num) {
        int count = 0;
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                count++;
            }

        }
        return count == 1;
    }

   public void addPrime() {
       for (int i = 1; i <= 1000; i++) {
            if (isPrime(i)) {
                prime.add(i);
            }
        }
    }

    public void checkPrime() {
       addPrime();


        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number:");
            int value = s.nextInt();
            if (value == -1) {
                break;
            }
            if (prime.contains(value)) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }


    }

    public static void main(String[] args) {
        Question3 q3 = new Question3();
        q3.checkPrime();
    }

}

