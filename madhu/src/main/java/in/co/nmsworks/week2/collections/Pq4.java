package in.co.nmsworks.week2.collections;

import java.util.ArrayList;

public class Pq4
{
    ArrayList<String> colors = new ArrayList<>();
    public void retainColors()
    {
        colors.add("red");
        colors.add("pink");
        colors.add("blue");
        boolean red = colors.contains("red");
        System.out.println(red);

    }
}
