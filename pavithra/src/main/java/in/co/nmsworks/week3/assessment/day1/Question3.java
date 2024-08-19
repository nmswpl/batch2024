package in.co.nmsworks.week3.assessment.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a list of colors: "Red", "Green", "Blue", "Yellow", "Orange",
 * write a method to extract and print a sublist containing the colors from index 1 to index 3 (inclusive).
 */

public class Question3 {

    public void subList(){

        List<String> colors = Arrays.asList("Red","Green","Blue","Yellow","Orange");
        System.out.println(colors.subList(1,4));



    }
}
