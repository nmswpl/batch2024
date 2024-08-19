package in.co.nmsworks.week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Write a method that merges two lists of colors, one being List<String> list1 = Arrays.asList("Red", "Green", "Blue") and another being List<String> list2 = Arrays.asList("Yellow", "Black", "White"), such that the resulting list contains all elements from both lists with list1 elements coming before list2 elements. Print the merged list.
 */

public class Question2 {
    public void addList(){
        List<String> list1 = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        List<String> list2 = new ArrayList<>(Arrays.asList("Yellow", "Black", "White"));

        for (String color : list2) {
            list1.add(color);
        }
        System.out.println(list1);
    }
}