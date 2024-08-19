package in.co.nmsworks.week3.day1;

import java.util.ArrayList;
import java.util.List;

/*
Given a list of colors: "Red", "Green", "Blue", "Yellow", "Orange",
write a method to extract and print a sublist containing the colors from index 1 to index 3 (inclusive).
 */
public class Question3 {
    public void sublist(){
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");


        List<String> sublist = new ArrayList<>();
        for (int i = 1; i <=3 ; i++) {
            sublist.add(colors.get(i));
        }
        System.out.println(sublist);
    }
}
