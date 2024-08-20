package in.co.nmsworks.week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question4 {

    //Write a method to find the longest color name in a list of colors and return it.

    public Question4() {


        List<String> colors = new ArrayList<>();
        colors.addAll(Arrays.asList("Red", "Green", "Blue", "Yellow", "Orange"));
        String longestWord = colors.get(0);
        for (String color : colors) {
            if(color.length() >= longestWord.length()){
                longestWord = color;
            }
        }

        System.out.println("Longest word:" + longestWord + "\n");

    }
}
