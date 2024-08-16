package in.co.nmsworks.week2.collections;

import java.util.ArrayList;

public class Pq6
{
    ArrayList<String> colors = new ArrayList<>();

    public void removeColors() {
        colors.add("red");
        colors.add("pink");
        colors.add("blue");
        colors.add("green");
        colors.add("black");
        System.out.println("Before removing" + colors);
        colors.remove(3);
        System.out.println("After removing" + colors);
    }
}
