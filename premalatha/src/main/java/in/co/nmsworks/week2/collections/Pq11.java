package in.co.nmsworks.week2.collections;
/*
Write a Java program to join two array lists.
 */

import java.util.ArrayList;
import java.util.List;

public class Pq11 {
    public void join()
    {
        List<String> colors =new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Black");
        System.out.println("List1 : " + colors);

        List<String> colors1 =new ArrayList<>();
        colors1.add("Darkred");
        colors1.add("Darkgreen");
        colors1.add("Darkorange");
        colors1.add("Darkblue");
        colors1.add("Darkrose");
        colors1.add("Grey");
        System.out.println("List2 : " + colors1);

        colors.addAll(colors1);
        System.out.println("The joined List : " + colors);
    }
}
