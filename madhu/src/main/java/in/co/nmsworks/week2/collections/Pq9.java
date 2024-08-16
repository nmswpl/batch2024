package in.co.nmsworks.week2.collections;

import java.util.ArrayList;

public class Pq9 {
    ArrayList<String> colors = new ArrayList<>();

    public void copyColors() {
        colors.add("red");
        colors.add("pink");
        colors.add("blue");
        colors.add("green");
        colors.add("black");
        System.out.println(colors);
        ArrayList<String> colors1 = new ArrayList<>();
        colors1 = colors;
        System.out.println(colors1);
    }
}
