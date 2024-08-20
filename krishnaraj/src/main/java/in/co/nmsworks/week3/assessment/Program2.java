package in.co.nmsworks.week3.assessment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/***
 * Given an array of integers, Write a Program to count and print number of even elements in the array.
 */
public class Program2 {
    public void countEvenNumbers() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Set<Integer> addNumber = new HashSet<>();
        int counts = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                addNumber.add(numbers[i]);
                counts++;
            }
        }
        System.out.println("The number of even Numbers : " + counts);
        System.out.println("The Even numbers ;" + addNumber);
    }
}
