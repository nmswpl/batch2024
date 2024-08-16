package in.co.nmsworks.week2.collections;
/*
Write a Java program to copy one array list into another.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pq8 {
    public void copy(){
        List<String> colors =new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Black");

        Set<String> copyColors=new HashSet<>(colors);
        System.out.println("Copy : " + copyColors);
    }

}
