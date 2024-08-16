package in.co.nmsworks.week2.collection;
// Write a Java program to print reverse elements in an array list.

import java.util.ArrayList;
import java.util.List;

public class Pq9 {
    public void reverseElement(){
        List<String> colours = new ArrayList<>();
        colours.add("Black");
        colours.add("Red");
        colours.add("Blue");
        colours.add("Green");
        System.out.println("Array List : " + colours);
        for (int i = colours.size()-1 ; i >=0 ; i--) {
            System.out.println(colours.get(i));
        }
    }
}
