package in.co.nmsworks.week2.collections;
/*
Write a Java program to create an array list, add some colors (strings) and print out the collection in set.
 */

import java.util.HashSet;
import java.util.Set;

public class Pq13 {
    public void set(){
        Set<String> colors=new HashSet<>();
        colors.add("Grey");
        colors.add("Black");
        colors.add("Pink");
        colors.add("Brown");
        System.out.println("Set :" + colors);

    }
}
