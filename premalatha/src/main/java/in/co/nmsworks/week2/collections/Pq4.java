package in.co.nmsworks.week2.collections;
/*
Write a Java program to retrieve an element (at a specified index) from a given array list.
 */

import java.util.ArrayList;
import java.util.List;

public class Pq4 {
    public void retrieve()
    {
        List<String> colors =new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Black");

        System.out.println("The retrived element : " +colors.get(2));
}
}

