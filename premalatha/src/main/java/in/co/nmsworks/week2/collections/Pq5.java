package in.co.nmsworks.week2.collections;
/*
Write a Java program to update an array element by the given element.

 */

import java.util.ArrayList;
import java.util.List;

public class Pq5 {
    public void update() {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Black");
        System.out.println("Before update : "+ colors);


        colors.set(3,"Grey");
        System.out.println("After update : "+colors);
    }
}
