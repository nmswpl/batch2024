package in.co.nmsworks.week2.collection;
/*
11. Write a Java program to join two array lists.
 */

import java.util.ArrayList;
import java.util.List;

public class Pq11 {
    public void setFlower() {
        List<String> flower = new ArrayList<String>();
        flower.add("Tamil");
        flower.add("English");
        flower.add("Maths");
        flower.add("Science");
    }

    public void SetPlant() {
        List<String> plant = new ArrayList<String>();
        plant.add("rose");
        plant.add("jasmine");
        plant.add("lavender");

    }

    List<String> merge = new ArrayList<String>();

    public void setMerge() {


        System.out.println("Merged : " + merge);
    }
}