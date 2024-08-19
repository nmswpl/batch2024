package in.co.nmsworks.week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Write a method that takes a list of lists and returns a single list containing all elements of the nested lists.
 */

public class Question5 {
    public void covertToSingleList(){
        List<List<String>> colorsList = new ArrayList<>(Arrays.asList(Arrays.asList("Red", "Green", "Blue", "Yellow", "Orange"),Arrays.asList("Red", "Green", "Blue", "Black", "White")));
        List<String > singleColorList = new ArrayList<>();

        for (List<String> colors : colorsList) {
            for (String color : colors) {
                singleColorList.add(color);
            }
        }
        System.out.println(singleColorList);
    }
}