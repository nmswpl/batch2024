package in.co.nmsworks.week3.assessment.day1;

import java.util.ArrayList;
import java.util.List;

/**
 * **Q1:** Given a list of colors: "Red", "Green", "Blue", "Yellow", "Green", "Blue", write a method to remove all duplicate colors and preserve the original order. Print the resulting list.
 */

public class Question1 {
    public static void main(String[] args) {
        List<String> colors=new ArrayList<>();
        List<String> colorList=new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");

        for (String color : colors) {
            if(colorList.contains(color)){
                continue;
        }
            else{
                colorList.add(color);
            }



        }
        System.out.println(colorList);
    }
}
