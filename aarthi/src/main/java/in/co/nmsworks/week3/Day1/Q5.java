package in.co.nmsworks.week3.Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/*
Write a method that takes a list of lists and returns a single list
containing all elements of the nested lists.
 */
public class Q5 {
    public void nestedLists() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);
        List<Integer> list3 = Arrays.asList(11, 12, 13, 14, 15);
        List<List<Integer>> mergeLists = new ArrayList<>();
        mergeLists.add(list1);
        mergeLists.add(list2);
        mergeLists.add(list3);
        System.out.println(mergeLists);

        List<Integer> answerList = convert(mergeLists);
        System.out.println(answerList);
    }

    private List<Integer> convert(List<List<Integer>> mergeLists) {
        List<Integer> finalLists = new ArrayList<>();
        for (int i = 0; i < mergeLists.size(); i++) {
            System.out.println(mergeLists.get(i));
            finalLists.addAll(mergeLists.get(i));

        }
        System.out.println(finalLists.size());
        return finalLists;
    }



    public static void main (String[]args){
            Q5 singleList = new Q5();
            singleList.nestedLists();
        }
}
