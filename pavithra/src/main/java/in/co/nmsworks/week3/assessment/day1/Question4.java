package in.co.nmsworks.week3.assessment.day1;

import java.util.Arrays;
import java.util.List;

/**
 * /**
 * * Write a method to find the longest color name in a list of colors and return it.
 */


public class Question4 {

    public String longestName() {

        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Yellow", "Orange");
        int max = 0;
        int index = 0;
        for (String color : colors) {
            if (max <= color.length()) {
                index = colors.indexOf(color);
                max = color.length();
            }
        }
        System.out.println(colors.get(index));

        return "";
    }
}
