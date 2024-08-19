package in.co.nmsworks.week3.assessment;


import java.util.HashSet;

import java.util.Scanner;
import java.util.Set;

//Write a program to find if a given number (less than 1000) is prime or not using Set.

public class TestExersice3 {
    public TestExersice3(){
        int i = 0;
        int num = 0;

        Set<Integer> primeNumbers = new HashSet<>();

        for (i = 1; i <= 1000; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers.add(i);
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elemnts in array:");
        int size = sc.nextInt();
        Integer[] numbers = new Integer[size];

        for (int j = 0; j < size; j++) {
            numbers[i] = sc.nextInt();
        }

        for (Integer number : numbers) {
            if (primeNumbers.contains(number)) {
                System.out.println(number + " is a prime number");
            }else{
                System.out.println(number + " is not a prime number");
            }
        }
    }
}

