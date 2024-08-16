package in.co.nmsworks.week2.collection;
// Write a Java program to create a set, add some colors (strings) and print out the collection.

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Pq12 {
    public void printColor(){
        Set<String> colors = new HashSet<>();
        colors.add("Black");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        for (String color : colors) {
            System.out.print(color + " ");
        }
    }
}
