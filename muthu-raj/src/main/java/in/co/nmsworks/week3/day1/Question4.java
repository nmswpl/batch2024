package in.co.nmsworks.week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 **Q4:** Write a method to find the longest color name in a list of colors and return it.
 */
public class Question4 {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Violet", "Sky Blue"));

        System.out.println(getLongestColor(colors));

    }

    private static String getLongestColor(List<String> colors) {
        int maxi = colors.get(0).length();
        String longestName = colors.get(0);
        for (String color : colors) {
            if( color.length() > maxi){
                longestName = color;
            }
        }
        return longestName;
    }
}
