package in.co.nmsworks.week3.assesment.day1;
// Write a method to find the longest color name in a list of colors and return it.

import java.util.ArrayList;
import java.util.List;

public class Colle4 {
    public void logestName(){
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        int length = 0;
        for (int i = 0; i < colors.size(); i++) {
            if(colors.get(i).length() >= length)
            {
                length = colors.get(i).length();
                System.out.println(colors.get(i));
            }
        }
    }
}
