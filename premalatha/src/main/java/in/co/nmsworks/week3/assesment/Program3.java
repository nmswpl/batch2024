package in.co.nmsworks.week3.assesment;
/*
Write a program to find if a given number (less than 1000) is prime or not using Set.
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program3 {
    public void primeOrNot(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number =scan.nextInt();


        Set<Integer> primeSet = new HashSet<>();
        for (int i = 1; i < 1000; i++) {
           if(i %2 != 0)
               primeSet.add(i);
        }
       if(primeSet.equals(number))
            System.out.println("Prime");
        else
            System.out.println("Not Prime");

    }
}
