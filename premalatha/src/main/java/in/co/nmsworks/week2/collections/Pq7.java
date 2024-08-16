package in.co.nmsworks.week2.collections;
/*
Write a Java program to search for an element in an array list.
 */

import java.util.ArrayList;
import java.util.List;

public class Pq7 {
    public void search() {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Black");

        colors.contains("Pink");
        System.out.println(colors.contains("Pink"));
    }
}
