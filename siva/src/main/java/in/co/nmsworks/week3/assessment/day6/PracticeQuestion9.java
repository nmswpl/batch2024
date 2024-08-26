package in.co.nmsworks.week3.assessment.day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a program to merge two `ArrayList` objects into a third `ArrayList`.
 */

public class PracticeQuestion9 {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> numList1 = new ArrayList<>(Arrays.asList(6,7,8,9,10));
        List<Integer> numList2 = new ArrayList<>();
        numList2.addAll(numList);
        numList2.addAll(numList1);
        System.out.println(numList2);
    }
}
