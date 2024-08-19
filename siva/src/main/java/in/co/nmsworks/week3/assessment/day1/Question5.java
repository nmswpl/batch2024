package in.co.nmsworks.week3.assessment.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * **Q5:** Write a method that takes a list of lists and returns a single list containing all elements of the nested lists.
 */

public class Question5 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(6,7,8,9,10));
        List<List<Integer>> listOfList =new ArrayList<>();
        listOfList.add(list1);
        listOfList.add(list2);
        List<Integer> list3 =new ArrayList<>();

        for (List<Integer> list : listOfList) {

            for (Integer i : list) {

                list3.add(i);



            }

        }
        System.out.println(list3);
    }
}
