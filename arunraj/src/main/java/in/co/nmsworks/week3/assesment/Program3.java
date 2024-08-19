package in.co.nmsworks.week3.assesment;

/*Write a program to find if a given number
(less than 1000) is prime or not using Set.
 */

import java.util.HashSet;
import java.util.Set;

public class Program3 {
    public void isPrime(int n){
        Set<Integer> numbers = new HashSet<>();
        int j=1;
        for(int i=1;i<=1000;i++,j++) {
            if (j % i != 0) {
                numbers.add(j);
            }
        }
        boolean isTrue = numbers.contains(n);
        System.out.println(isTrue);
        if(isTrue){
            System.out.println("The number is notPrime");
        }
        else {
            System.out.println("The number is Prime");
        }
    }
}

/*int flag=0;
        for(int i=2;i<=isPrimeOrNot.size();i++){
            if(n%i==0){
                System.out.println("The number is prime");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("The number is not prime");
        }*/
