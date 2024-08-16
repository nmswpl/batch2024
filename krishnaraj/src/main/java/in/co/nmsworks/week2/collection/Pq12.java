package in.co.nmsworks.week2.collection;
import java.util.*;

/**
 *  Write a Java program to create an array list, add some colors (strings) and print out the collection.
 */
public class Pq12 {
    public void arrayListIn() {
        Set<String> colors=new HashSet<>(5);
        colors.add("blue");
        colors.add("white");
        colors.add("red");
        colors.add("green");
        colors.add("black");
        for (String color: colors){
            System.out.println(color);
        }
    }
}
