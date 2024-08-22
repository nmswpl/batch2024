package in.co.nmsworks.week3.day4;

import java.util.*;

/**
 * Write a program to find the mode (most frequent element) of an array.
 */
public class Training10 {
    public void findMostFrequentElement(Integer... inputArray) {
        int value = 0;
        int count = 0;
        Set<Integer> uniqueNumberList = new HashSet<>(Arrays.asList(inputArray));

        for (Integer i : uniqueNumberList) {
            int occurance = 0;
            for (int j : inputArray) {
                if (i == j) {
                    occurance += 1;
                }
            }
            System.out.println(i+" appears "+occurance+" time");
            if (count < occurance) {
                count = occurance;
                value = i;
            }
        }

        System.out.println("Most Frequent Element: " + value + " is the most frequent with " + count + " occurrences");
    }
}
