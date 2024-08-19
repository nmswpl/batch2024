package in.co.nmsworks.week3.Day1;
/*
Given a list of colors: "Red", "Green", "Blue", "Yellow", "Orange", write a method to extract and
print a sublist containing the colors from index 1 to index 3 (inclusive).

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q3 {

    public void sublist() {
        List<String> color = Arrays.asList("Red", "Green", "Blue", "Yellow", "Orange");
        System.out.println(color.subList(1, 4));
    }


    public static void main(String[] args) {
        Q3 sublist = new Q3();
        sublist.sublist();

    }
}
