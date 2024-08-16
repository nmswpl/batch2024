package in.co.nmsworks.week2.collection;
// 11. Write a Java program to copy one array list into another.

import java.util.ArrayList;
import java.util.List;

public class Pq11 {
    public void joinArray() {
        List<String> colours = new ArrayList<>();
        List<String> animal = new ArrayList<>();
        colours.add("Black");
        colours.add(1, "Red");
        colours.add(2, "Blue");
        colours.add("Green");
        System.out.println("Array List of Colours (Before Copy) : " + colours);
        animal.add("Cow");
        animal.add("Dog");
        animal.add("Cat");
        animal.add("Lion");
        animal.add("Tiger");
        System.out.println("Array List of Animal : " + animal);
        colours.addAll(animal);
        System.out.println("Array List of Colours (After Copy) : " + colours);
    }
}
