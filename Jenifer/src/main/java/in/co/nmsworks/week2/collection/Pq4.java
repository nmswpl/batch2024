package in.co.nmsworks.week2.collection;
// Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.ArrayList;
import java.util.List;

public class Pq4 {

    public void retrieveElement(){
        List<String> colours = new ArrayList<>();
        colours.add("Black");
        colours.add("Red");
        colours.add("Blue");
        colours.add("Green");
        colours.add("Yellow");
        System.out.println("Retrieved element : " + colours.get(3));
    }
}
