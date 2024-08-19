package in.co.nmsworks.week3.day1;
/*
Write a method to find the longest color name in a list of colors and return it.
 */

import java.util.ArrayList;
import java.util.List;

public class Question4 {
    public void longerColorName(){
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Grey");

        int maxLength =0;
        String longestWord = colors.get(0);
        for (String color : colors) {
            if(color.length() >= maxLength){
                maxLength = color.length();
                longestWord = color;
            }
        }

        System.out.println("Longest word:" + longestWord + "\n");


    }
}
