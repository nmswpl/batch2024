package in.co.nmsworks.week3.assessment.day1;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a list of colors: "Red", "Green", "Blue", "Yellow", "Green", "Blue",
 * write a method to remove all duplicate colors and preserve the original order. Print the resulting list.
 */

public class Question1 {

    public void removeDuplicate() {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");

        List<String> results = new ArrayList<>();

        for (String color : colors) {
            if (!results.contains(color)) {
                results.add(color);
            }


        }
        System.out.println(results);
    }


}

