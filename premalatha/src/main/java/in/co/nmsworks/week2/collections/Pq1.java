package in.co.nmsworks.week2.collections;
/*
Write a Java program to create an array list, add some colors (strings) and print out the collection.
 */

import java.util.ArrayList;
import java.util.List;

public class Pq1 {
    public void list()
    {
        List<String> colors =new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Black");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("List : " + colors.get(i));
        }


    }

}
