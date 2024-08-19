package in.co.nmsworks.week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a method to find the longest color name in a list of colors and return it.
 */

public class Q04 {
    public static void main(String[] args) {
        List<String> colourList = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Green", "Blue"));
        Q04 q04 = new Q04();
        System.out.println(q04.findLongestColour(colourList));

    }

    private String findLongestColour(List<String> colourList) {
        int maxSize = 0;
        int indexOfLongestWord = 0;
        for (String value : colourList) {
            if (maxSize <= value.length()){
                indexOfLongestWord = colourList.indexOf(value);
                maxSize = value.length();
            }
        }
        return colourList.get(indexOfLongestWord);
    }
}
