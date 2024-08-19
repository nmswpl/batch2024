package in.co.nmsworks.week3.day1;
//**Q4:** Write a method to find the longest color name in a list of colors and return it.

import java.util.ArrayList;
import java.util.List;

public class Ques4 {
    public void longestColourName(){
        List<String> colours=new ArrayList<>();
        colours.add("Red");
        colours.add("Green");
        colours.add("Blue");
        colours.add("Yellow");
        colours.add("Green");
        colours.add("Blue");
        colours.add("purple");
        colours.add("Black");
        int max=0;
        String longcolor="";
        for (String colour : colours) {
            if(max < colour.length()){
                max=colour.length();
                longcolor=colour;
            }
        }
        System.out.println("the longest color name in the list "+longcolor);

    }
}
