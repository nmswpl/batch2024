package in.co.nmsworks.week3.assignment.Day4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program2 {
    public static void main(String[] args) throws IOException {
        Program2 pg2 = new Program2();
        pg2.MulOf35();
        pg2.leapYear(2024);
        pg2.sumNum(456);
        pg2.maxArrayElement();
        pg2.meanOfArray();
        pg2.medain();
        pg2.gcd(18, 4);
        pg2.secondLargestElement();
    }
 /*Write a program that prints numbers from 1 to 100. For multiples of 3,
 print "Fizz" instead of the number. For multiples of 5, print "Buzz".
  For multiples of both 3 and 5, print "FizzBuzz".
  */


    public void MulOf35() {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzBuzz");
            }
        }
        System.out.println("**********");
    }
 /*Write a program to check if a given year is a leap year.

  A Year is considered a leap year if it meets one of the following conditions:*/

    public void leapYear(int year) {
        if (year % 100 == 0 && year % 4 == 0) {
            System.out.println("not a leap Year");
        } else if (year % 4 == 0) {
            System.out.println("Leap Year");
        } else if (year % 400 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");

        }
        System.out.println("**********");

    }

    /* Write a program to find the sum of digits of a given integer.*/
    public void sumNum(int num) {
        int sum = 0;
        int i = 0;
        while (i < num) {
            sum = sum + num % 10; // Add the last digit to the sum
            num = num / 10;
        }
        System.out.println("The sum of digits " + sum);
        System.out.println("**********");
    }
    /*Implement the algorithm to find the min and max elements in an array of integers. */

    public void maxArrayElement() {
        int arr[] = {1, 4, 5, 2, 3};
        int max = arr[0];
        int minimum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("the max element in the array is: " + max);
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        System.out.println("the minimum element is: " + min);
        System.out.println("**********");
    }

    /*Write a program to find the second largest number in an array.*/
    public void secondLargestElement() {
        int arr[] = {8, 9, 10, 11};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The max element is : " + max);
        int secondMax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }
        System.out.println("The second maximum element is " + secondMax);
        System.out.println("**********");
    }

    /*Write a program to find the mean of an array.*/
    public void meanOfArray() {
        int arr[] = {1, 2, 3, 4, 5};
        int sum = 0;
        int div = arr.length;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("the sum of elements: " + sum);
        int avg = sum / div;
        System.out.println("The mean of the array is : " + avg);
        System.out.println("**********");
    }

    /*Write a program to find the median of an array.*/
    public void medain() {
        int arr[] = {2, 4, 6, 8, 10};
        int arrLen = arr.length;
        if (arrLen % 2 != 0) {
            int n = arrLen / 2;
            System.out.println("The median is : " + arr[n]);
        }
        if (arrLen % 2 == 0) {
            int n = arrLen / 2;
            System.out.println("The median is : " + arr[n] + arr[n + 1] / 2);
        }
        System.out.println("**********");
    }

    /*Write a program to find the mode (most frequent element) of an array.
            Count the Frequency:
                4 appears 1 time
                7 appears 3 times
                1 appears 2 times
                8 appears 1 time
            Identify the Most Frequent Element: 7 is the most frequent with 3 occurrences.
            Mode: The mode is 7.*/
    /*public void frequentElement() {
        int arr[] = {1, 1, 2, 3, 2, 3, 4, 4};
        for (int i = 0; i < arr.length; i++) {


        }
    }
*/
    /*Write a program to find the greatest common divisor (GCD) of two integers using the Euclidean algorithm.
           Initial Step: Let a and b be the two numbers where a > b.
           Step 1: Compute the remainder of a divided by b (i.e., r = a % b).
           Step 2: Replace a with b and b with r.
           Repeat: Repeat the process until b becomes 0. The non-zero value of a at this point will be the GCD
           of the original two numbers.
     */
    List<Integer> list = new ArrayList<>();

    public void gcd(int a, int b) {
        for (int i = 1; i < a; i++) {
            if (a % i == 0 && b % i == 0) {
                list.add(i);
            }
        }
        int n = list.size() - 1;
        System.out.println("the gcd of " + a + " and " + b + " is: " + list.get(n));
        System.out.println("**********");
    }
}


