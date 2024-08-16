package in.co.nmsworks.week2.collections;

/*
Write a Java program to iterate through all elements in an array list.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pq2 {
    public void iterate()
    {
        List<String> colors =new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Black");

        for(int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        Set<String> animals=new HashSet<>();
        animals.add("Lion");
        animals.add("Cow");
        animals.add("Tiger");
        animals.add("Deer");

        System.out.println("Set  : " + animals);
    }

}
