package in.co.nmsworks.week2.collections;

import java.util.HashSet;
import java.util.Set;

/**
 * Write a Java program to create Set, add some colors (strings) and print out the collection.
 */

public class PQ12 {
    Set<String> color=new HashSet<>();


    public void setColor()
    {
        color.add("red");
        color.add("blue");
        color.add("white");

        for (String color : color) {
            System.out.println(color);



}}}
