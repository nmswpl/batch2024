package in.co.nmsworks.week3.day1;
/*
Given a list of colors: "Red", "Green", "Blue", "Yellow", "Green", "Blue",
write a method to remove all duplicate colors and preserve the original order. Print the resulting list.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question1 {
    public void duplicateColor() {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Before removing duplicates : " + colors);


        List<String> results = new ArrayList<>();

        for (String color : colors) {
            if (results.contains(color)) {
                continue;
            }
            else
                results.add(color);
        }
        System.out.println(results);

    }
}
