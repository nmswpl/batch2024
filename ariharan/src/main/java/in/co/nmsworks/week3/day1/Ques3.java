package in.co.nmsworks.week3.day1;

import java.util.ArrayList;
import java.util.List;

//**Q3:** Given a list of colors: "Red", "Green", "Blue", "Yellow", "Orange",
//write a method to extract and print a sublist containing the colors from index 1 to index 3 (inclusive).
public class Ques3 {
    public void sublistOfColours(){
        List<String> colours=new ArrayList<>();
        List<String> subListColours=new ArrayList<>();
        colours.add("Red");
        colours.add("Green");
        colours.add("Blue");
        colours.add("Yellow");
        colours.add("Orange");
        subListColours.addAll(colours.subList(1,4));
        for (String colour : subListColours) {
            System.out.println(colour);

        }
    }
}
