package in.co.nmsworks.week2.collection;
// Write a Java program to compare two array lists.

import java.util.ArrayList;
import java.util.List;

public class Pq10 {
    public void compareArray() {
        List<String> colours = new ArrayList<>();
        List<String> animal = new ArrayList<>();
        List<String> animal1 = new ArrayList<>();
        colours.add("Black");
        colours.add("Red");
        colours.add("Blue");
        colours.add("Green");
        animal.add("Cow");
        animal.add("Dog");
        animal.add("Cat");
        animal.add("Lion");
        animal.add("Tiger");
        animal1.add("Cow");
        animal1.add("Dog");
        animal1.add("Cat");
        animal1.add("Lion");
        animal1.add("Tiger");
        System.out.println("Colours Array = Animal Array : " + colours.equals(animal));
        System.out.println("Colours Array = Animal Array : " + animal.equals(animal1));
    }
}
