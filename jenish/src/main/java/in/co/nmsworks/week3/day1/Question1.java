package in.co.nmsworks.week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given a list of colors: "Red", "Green", "Blue", "Yellow", "Green", "Blue", write a method to remove all duplicate colors and preserve the original order. Print the resulting list.
 */

public class Question1 {
    public void removeDuplicates(){
        List<String> colorsList = new ArrayList<>();
        colorsList.addAll(Arrays.asList("Red","Green","Blue","Yellow","Green", "Blue"));

        List<String> colorsList1 = new ArrayList<>();
        colorsList1.add(colorsList.getFirst());

        for (int i = 1; i < colorsList.size(); i++) {
            String color = colorsList.get(i);
            if (!colorsList1.contains(color)) {
                colorsList1.add(color);
            }
        }
        System.out.println(colorsList1);
    }
}