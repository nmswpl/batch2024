package in.co.nmsworks.week3.assessment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/***Write a program to find if a given number (less than 1000) is prime or not using Set.
 *
 */
public class Program3 {
    public void checkPrime() {
        List<Integer> primeNumbersList = new ArrayList<>();
        for (int i = 1; i < 1000; i++) {
            int primeNumber = i;
            if (primeNumber <= 1) {
            } else if (primeNumber == 2 || primeNumber == 3) {
                primeNumbersList.add(i);
            } else if (primeNumber==5) {
                primeNumbersList.add(i);
            } else if (primeNumber % 2 == 0 ||primeNumber % 3 == 0) {
            } else if (primeNumber % 5 == 0) {
            } else {
                primeNumbersList.add(i);
            }
        }
        /**for (Integer val: primeNumbersList){
            System.out.println(val);
        }
**/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int checkNumber = sc.nextInt();
        if (primeNumbersList.contains(checkNumber)) {
            System.out.println("this is an prime : " + checkNumber);
        } else {
            System.out.println("this is not prime : " + checkNumber);
        }
    }

}
