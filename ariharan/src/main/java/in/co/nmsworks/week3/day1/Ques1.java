package in.co.nmsworks.week3.day1;
//**Q1:** Given a list of colors: "Red", "Green", "Blue", "Yellow", "Green", "Blue",
//write a method to remove all duplicate colors and preserve the original order. Print the resulting list.

import java.util.ArrayList;
import java.util.List;

public class Ques1 {
    public void removeDuplicates(){
        List<String> colours=new ArrayList<>();
        List<String> afterRemoveDuplicates=new ArrayList<>();
        colours.add("Red");
        colours.add("Green");
        colours.add("Blue");
        colours.add("Yellow");
        colours.add("Green");
        colours.add("Blue");
        System.out.println("before removing duplicates::"+colours);

        for (String colour : colours) {
            if(afterRemoveDuplicates.contains(colour)){
                continue;
            }
            else{
                afterRemoveDuplicates.add(colour);
            }
            
        }
        for (String color : afterRemoveDuplicates) {
            System.out.println(color);

        }
    }
    
}
