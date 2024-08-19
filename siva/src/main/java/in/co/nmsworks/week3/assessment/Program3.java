package in.co.nmsworks.week3.assessment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 3) Write a program to find if a given number (less than 1000) is prime or not using Set.
 */

public class Program3 {
    public static void main(String[] args) {
        Set<Integer> primeSet = new HashSet<>();
        Program3 evenNumberSet = new Program3();
        evenNumberSet.primeNumber(primeSet);
        Scanner  sc = new Scanner(System.in);
        Integer number = sc.nextInt();
        int i = 0;
        while (i >= -1){
            System.out.print("Enter the number :: ");

            if (number==-1){
                break;
            }
            else {
                evenNumberSet.isPrime(primeSet, number);
            }
        }
    }


    public void primeNumber(Set<Integer> primeSet){
        for (int numbers = 0; numbers < 1000; numbers++) {
            boolean isPrime1 = true;
            for (int i = 2; i <= numbers/2 ; i++) {
                if (numbers % i == 0){
                    isPrime1 = false;
                    break;
                }
            }
            if (isPrime1) {
                primeSet.add(numbers);
            }
        }
    }
    public void isPrime(Set<Integer> primeSet,Integer num){
        if(primeSet.contains(num)){
            System.out.println("Given number "+num+" is a prime !!");
        }
        else {
            System.out.println("Given number "+num+" is not a prime !!");
        }
    }

    }




