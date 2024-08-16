package in.co.nmsworks.week2.collection;
// Write a Java program to create an array list, add some colors (strings) and print out the collection.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pq1 {
    public void addColour() {
        List<String> colours = new ArrayList<>(5);
        colours.add("Black");
        colours.add("Red");
        colours.add("Blue");
        colours.add("Green");
        for (int i = 0; i < colours.size(); i++) {
            String colors = colours.get(i);
        }
            System.out.println("Array List : " +colours);
        }
    }