package in.co.nmsworks.week2.collection;
// Write a Java program to insert an element into the array list at the first position.

import java.util.ArrayList;
import java.util.List;

public class Pq3 {
    List<String> colours = new ArrayList<>();
    public void insertColour(){
        colours.add("Black");
        colours.add("Red");
        colours.add("Blue");
        colours.add("Green");
        System.out.println("Before insertion : " + colours);
        colours.add(0,"Yellow");
        System.out.println("After insertion : " + colours);

        System.out.println("Before Set : " + colours);
        colours.set(0, "Pink");
        System.out.println("After Set : " +colours);
    }
}
