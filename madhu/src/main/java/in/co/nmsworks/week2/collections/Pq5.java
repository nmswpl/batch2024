package in.co.nmsworks.week2.collections;

import java.util.ArrayList;

public class Pq5 {
    ArrayList<String> colors = new ArrayList<>();

    public void updateColors() {
        colors.add("red");
        colors.add("pink");
        colors.add("blue");
        System.out.println("Before updating" + colors);
        colors.add("Red");
        System.out.println("After updating" + colors);

    }
}