package in.co.nmsworks.week3.assessment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/***Write a program to find if a given number (less than 1000) is prime or not using Set.
 *
 */
public class Program3 {
    List<Integer> primeNumbersList = new ArrayList<>();
    public void addPrime(int number){
        int count = 0;
        for (int i = 1; i <= number/2; i++) {
            if(number % i == 0){
                count++;
            }
        }
        if (count ==1){
            primeNumbersList.add(number);
        }

    }
    public void makingPrimeList(){
        for (int i = 1; i < 1000; i++){
            addPrime(i);
        }
    }

    public void checkPrimeUsingSet(){
        Scanner sc = new Scanner(System.in);
        makingPrimeList();
        System.out.println("Enter a number : ");
        int checkNumber = sc.nextInt();
        if (primeNumbersList.contains(checkNumber)) {
            System.out.println("this is an prime : " + checkNumber);
        } else {
            System.out.println("this is not prime : " + checkNumber);
        }
    }
}
