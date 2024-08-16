package in.co.nmsworks.week2.collections;
/*
Write a Java program to remove the third element from an array list.
 */

import java.util.ArrayList;
import java.util.List;

public class Pq6 {
    public void remove() {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Black");
        System.out.println("Before remove : " + colors);

        colors.remove(2);
        System.out.println("After remove : " + colors);
    }
}
