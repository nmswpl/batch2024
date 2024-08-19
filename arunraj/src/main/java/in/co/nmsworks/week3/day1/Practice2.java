package in.co.nmsworks.week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/***Q2:** Write a method that merges two lists of colors, one being List<String> list1 = Arrays.asList("Red", "Green", "Blue") and another being List<String> list2 = Arrays.asList("Yellow", "Black", "White"), such that the resulting list contains all elements from both lists
 *

with list1 elements coming before list2 elements. Print the merged list.*/

public class Practice2 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        String[] colors1 = {"Red", "Green", "Blue"};
        Collections.addAll(list1,colors1);
        List<String> list2 = new ArrayList<>();
        String[] colors2 = {"Yellow", "Black", "White"};
        Collections.addAll(list2,colors2);
        List<String> result = new ArrayList<>();

        for(String i : list1){
            result.add(i);
        }
        for(String i : list2){
            result.add(i);
        }
        System.out.println(result);
    }
}
