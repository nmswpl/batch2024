package in.co.nmsworks.week3.assessment.day1;
/*

 **Q2:** Write a method that merges two lists of colors, one being List<String> list1 = Arrays.asList("Red", "Green", "Blue") and another being List<String> list2 = Arrays.asList("Yellow", "Black", "White"), such that the resulting list contains all elements from both lists with list1 elements coming before list2 elements. Print the merged list.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question2 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(Arrays.asList("Red","Green","Blue"));
        List<String> list2 = new ArrayList<>(Arrays.asList("Yellow","Black","White"));
        list1.addAll(list2);
        System.out.println(list1);
    }
}
