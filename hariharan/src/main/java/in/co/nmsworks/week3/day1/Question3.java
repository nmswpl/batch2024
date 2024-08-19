package in.co.nmsworks.week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question3 {

    //Given a list of colors: "Red", "Green", "Blue", "Yellow", "Orange", write a method to extract and print a sublist containing the colors from index 1 to index 3 (inclusive).

    public Question3() {

        List<String> colors = new ArrayList<>();
        colors.addAll(Arrays.asList("Red", "Green", "Blue", "Yellow", "Orange"));

        System.out.println("Sublist of Colors: " + colors.subList(1,4)+"\n");
    }
}
