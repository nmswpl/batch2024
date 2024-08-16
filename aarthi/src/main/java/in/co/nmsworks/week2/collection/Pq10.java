package in.co.nmsworks.week2.collection;
/*
Write a Java program to compare two array lists.

 */

import java.util.ArrayList;
import java.util.List;

public class Pq10 {
    List<String> flower = new ArrayList<String>();
    List<String> plant = new ArrayList<String>();
    public void setFlower()
    {
        flower.add("Tamil");
        flower.add("English");
        flower.add("Maths");
        flower.add("Science");
    }
    public void SetPlant()
    {
        plant.add("rose");
        plant.add("jasmine");
        plant.add("lavender");

    }
    public void equal()
    {
        boolean b=flower.equals(plant);
        System.out.println(b);
    }
}
