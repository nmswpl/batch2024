package in.co.nmsworks.week2.collections;
/**
 * 1. Write a Java program to create an array list, add some colors (strings) and print out the collection
 */

import java.util.ArrayList;
import java.util.List;

public class Pq1 {

    public void addColors() {

        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Green");
        colors.add("Yellow");
        for (int i = 0; i < colors.size(); i++) {

            System.out.println(colors.get(i));

        }


    }


}
