package in.co.nmsworks.week2.collections;

import java.util.ArrayList;

public class Pq2
{
    ArrayList<String> colors = new ArrayList<>();
    public void iterateColors()
    {
            colors.add("red");
            colors.add("pink");
            colors.add("blue");
            System.out.println(colors);
            for(String colorName : colors)
                System.out.println(colorName);

    }
}