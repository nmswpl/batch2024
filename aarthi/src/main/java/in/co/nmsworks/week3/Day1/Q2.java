package in.co.nmsworks.week3.Day1;
/*
Write a method that merges two lists of colors, one being
List<String> list1 = Arrays.asList("Red", "Green", "Blue") and another being
List<String> list2 = Arrays.asList("Yellow", "Black", "White"),
such that the resulting list contains all elements from both lists with list1 elements coming before list2 elements. Print the merged list.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2 {
    public Q2() {
        List<String> list1 = Arrays.asList("Red", "Green", "Blue");
        List<String> list2 = Arrays.asList("Yellow", "Black", "White");
        List<String> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        System.out.println(mergedList);
    }

    public static void main(String[] args) {
        Q2 merge = new Q2();

    }
}



