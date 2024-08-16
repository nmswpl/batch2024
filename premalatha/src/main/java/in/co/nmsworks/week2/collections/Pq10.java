package in.co.nmsworks.week2.collections;
/*
Write a Java program to compare two array lists.
 */

import java.util.ArrayList;
import java.util.List;

public class Pq10 {
    public void compare() {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Black");

        List<String> colors1 = new ArrayList<>();
        colors1.add("Red");
        colors1.add("Green");
        colors1.add("Orange");
        colors1.add("Blue");
        colors1.add("Pink");
        colors1.add("Black");


        System.out.println(colors.equals(colors1));

    }


}
