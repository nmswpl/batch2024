package in.co.nmsworks.week3.assessment.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a method that accepts a `List<List<Integer>>` and returns a flattened `List<Integer>` containing all the integers from the nested lists.
 */

public class Question9 {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> numList1 = new ArrayList<>(Arrays.asList(6,7,8,9,10,11,12));
        List<List<Integer>> listOfList = new ArrayList<>();
        listOfList.add(numList);
        listOfList.add(numList1);
        List<Integer> numList2 = new ArrayList<>();
        for (List<Integer> list : listOfList) {
            for (Integer i : list) {
                numList2.add(i);

            }

        }
        System.out.println(numList2);
    }
}
