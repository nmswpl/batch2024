package in.co.nmsworks.week3.assessment.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * **Q3:** Given a list of colors: "Red", "Green", "Blue", "Yellow", "Orange", write a method to extract and print a sublist containing the colors from index 1 to index 3 (inclusive).
 */

public class Question3 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(Arrays.asList("Red","Green","Blue","Yellow","Orange"));
        List<String> colorList = new ArrayList<>();

        for(int i=1;i<colors.size()-1;i++){
            colorList.add(colors.get(i));
        }
        System.out.println(colorList);
    }
}