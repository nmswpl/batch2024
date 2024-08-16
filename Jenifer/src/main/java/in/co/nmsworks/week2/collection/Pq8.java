package in.co.nmsworks.week2.collection;
// Write a Java program to copy one array list into another.

import java.util.ArrayList;
import java.util.List;

public class Pq8 {
    public void copyArray(){
        List<String> colours = new ArrayList<>();
        List<String> colours1 = new ArrayList<>();
        colours.add("Black");
        colours.add("Red");
        colours.add("Blue");
        colours.add("Green");
        colours1.addAll(colours);
        System.out.println("Array List : " + colours1);
    }
}
