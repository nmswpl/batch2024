package in.co.nmsworks.week3.assessment.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a method that merges two lists of colors, one being List<String> list1 = Arrays.asList("Red", "Green", "Blue")
 * and another being List<String> list2 = Arrays.asList("Yellow", "Black", "White"),
 * such that the resulting list contains all elements from both lists with list1 elements coming before list2 elements.
 * Print the merged list.
 */

public class Question2 {

    public void merge(){
        List<String> list1 = Arrays.asList("Red", "Green", "Blue");
        List<String> list2 = Arrays.asList("Yellow", "Black", "White");
       // list2.addAll(list1);

        List<String> results = new ArrayList<>();
        results.addAll(list1);
        results.addAll(list2);

        System.out.println(results);





    }
}
