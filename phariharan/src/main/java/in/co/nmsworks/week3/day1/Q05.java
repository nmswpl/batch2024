package in.co.nmsworks.week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a method that takes a list of lists and returns a single list containing all elements of the nested lists.
 */

public class Q05 {
    public static void main(String[] args) {
        List<String> colourList1 = new ArrayList<>(Arrays.asList(new String[]{"Red", "Green", "Blue", "Yellow", "Green", "Blue"}));
        List<String> colourList2 = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        List<String> colourList3 = new ArrayList<>(Arrays.asList("Yellow", "Black", "White"));
        List<List<String>> colourListCombined = new ArrayList<>();
        colourListCombined.add(colourList1);
        colourListCombined.add(colourList2);
        colourListCombined.add(colourList3);
        System.out.println(colourListCombined);

        Q05 q05 = new Q05();
        System.out.println("Combined into single list using addAll Method : "+q05.combineIntoSingleList(colourListCombined).toString());
        System.out.println("Combined into single list using loop : "+q05.combineIntoSingleListUsingLoop(colourListCombined).toString());

    }

    public List<String> combineIntoSingleList(List<List<String>> colourListCombined) {
        List<String> resultantList = new ArrayList<>();
        for (List<String> stringsList : colourListCombined) {
            resultantList.addAll(stringsList);
        }
        return resultantList;
    }

    public List<String> combineIntoSingleListUsingLoop(List<List<String>> colourListCombined) {
        List<String> resultantList1 = new ArrayList<>();
        for (List<String> stringList : colourListCombined) {
            for (String value : stringList) {
                resultantList1.add(value);
            }
        }
        return resultantList1;
    }
}