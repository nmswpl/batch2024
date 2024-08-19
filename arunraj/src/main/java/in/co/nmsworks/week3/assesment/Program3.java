package in.co.nmsworks.week3.assesment;

/*Write a program to find if a given number
(less than 1000) is prime or not using Set.
 */

import java.util.HashSet;
import java.util.Set;

public class Program3 {
    public void addElements() {
        Set<Integer> numbers = new HashSet<>();
        for (int i = 1; i <= 1000; i++) {
               numbers.add(i);
            }
        Set<Integer> primeNumbers = new HashSet<>();
        int j=1;
        for (Integer i : numbers){
            if(j%i!=0){
                primeNumbers.add(j);
            }
        }
    }
}
