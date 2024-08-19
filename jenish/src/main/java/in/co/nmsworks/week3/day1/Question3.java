package in.co.nmsworks.week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given a list of colors: "Red", "Green", "Blue", "Yellow", "Orange", write a method to extract and print a sublist containing the colors from index 1 to index 3 (inclusive).
 */

public class Question3 {
    public void extractList(){
        List<String> colorsList = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Orange"));
        List<String> colorsList1 = new ArrayList<>();
        for (int i = 1; i < colorsList.size()-1 ; i++) {
            colorsList1.add(colorsList.get(i));
        }
        System.out.println(colorsList1);
    }
}