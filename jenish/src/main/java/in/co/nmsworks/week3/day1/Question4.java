package in.co.nmsworks.week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Write a method to find the longest color name in a list of colors and return it.
 */

public class Question4 {
    public void findLongestColorName(){
        List<String> colorsList = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Orange"));
        int longest = 0;
        String longestColor = colorsList.getFirst();

        for (String color : colorsList) {
            if(color.length() > longest){
                longest = color.length();
                longestColor = color;
            }
        }
        System.out.println("Longest color name :: "+longestColor);
    }
}