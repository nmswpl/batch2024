package in.co.nmsworks.week2.collections;

import java.util.HashSet;
import java.util.Set;

/**
 * Write a Java program to create an array list, add some colors (strings) and print out the collection.
 */

public class PQ12 {
    public Set<String> colours = new HashSet<>();
    public void addColourset(String colour){
        colours.add(colour);
    }
    public void displayDetails(){
        for(String values : colours){
            System.out.println(values);
        }
    }
}
