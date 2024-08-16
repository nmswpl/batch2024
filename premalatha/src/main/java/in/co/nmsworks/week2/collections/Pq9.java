package in.co.nmsworks.week2.collections;
/*
Write a Java program to print reverse elements in an array list.
 */

import java.util.ArrayList;
import java.util.List;

public class Pq9 {
    public void reverse()
    {
        List<String> colors =new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Black");
        System.out.println(colors.size());

        for (int i = colors.size()-1; i >=0; i--) {
            System.out.println("Reverse : " + colors.get(i));

        }

    }
}
