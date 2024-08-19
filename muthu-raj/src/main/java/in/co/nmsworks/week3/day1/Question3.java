package in.co.nmsworks.week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 **Q3:** Given a list of colors: "Red", "Green", "Blue", "Yellow", "Orange",
 * write a method to extract and print a sublist containing the colors from index 1 to index 3 (inclusive).
 */
public class Question3 {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Orange"));

        List<String> subList = new ArrayList<>();
        int start = 1;
        int end = 3;
        for (int i = start; i <= end; i++) {

            subList.add(colors.get(i));
        }
        System.out.println(subList);

    }
}
