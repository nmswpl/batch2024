package in.co.nmsworks.week2.collections;

/*
Write a Java program to insert an element into the array list at the first position.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pq3 {
    public void insert()
    {
        List<String> colors =new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Black");
        System.out.println("Before insert : " + colors);

        colors.add(0,"Grey");
        System.out.println("After insert :"+ colors);


        colors.set(0,"Yellow");
        System.out.println("After set :" + colors);

    }
}
