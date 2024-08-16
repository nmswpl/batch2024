package in.co.nmsworks.week2.collection;
// Write a Java program to update an array element by the given element.

import java.util.ArrayList;
import java.util.List;

public class Pq5 {
    public void updateElement() {
        List<String> animal = new ArrayList<>();
        animal.add("Cow");
        animal.add("Dog");
        animal.add("Cat");
        animal.add("Lion");
        animal.add("Tiger");
        System.out.println("Array List : " + animal);
        animal.set(2, "Horse");
        System.out.println("Updated Array List : " + animal);
    }
}
