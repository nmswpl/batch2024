package in.co.nmsworks.week3.day1;

import java.util.*;

/*
 **Q1:** Given a list of colors: "Red", "Green", "Blue", "Yellow", "Green", "Blue", write a method
 * to remove all duplicate colors and preserve the original order. Print the resulting list.
 */
public class Question1 {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.addAll(Arrays.asList("Red", "Green", "Blue", "Yellow", "Green", "Blue"));
        System.out.println("Before removing duplicates::");
        System.out.println(colors);

        List<String> newColors = new ArrayList<>();

        for (String color : colors) {
            if (newColors.contains(color)) {
                continue;
            }
            else {
                newColors.add(color);
            }

        }

        System.out.println("After removing duplicates::");
        System.out.println(newColors);

    }
}
