package in.co.nmsworks.week2.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Pq8 {
    ArrayList<String> colors = new ArrayList<>();

    public void sortColors() {
        colors.add("red");
        colors.add("pink");
        colors.add("blue");
        colors.add("green");
        colors.add("black");
        Collections.sort(colors);
        System.out.println("Sorted array" + colors);


    }
}
