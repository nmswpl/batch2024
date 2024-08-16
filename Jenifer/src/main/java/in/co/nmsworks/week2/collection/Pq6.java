package in.co.nmsworks.week2.collection;
// Write a Java program to remove the third element from an array list.

import java.util.ArrayList;
import java.util.List;

public class Pq6 {
    public void removeElement() {
        List<String> animal = new ArrayList<>();
        animal.add("Cow");
        animal.add("Dog");
        animal.add("Cat");
        animal.add("Lion");
        animal.add("Tiger");
        animal.add(2, "Horse");
        System.out.println("Array List : " + animal);
        animal.remove(2);
        System.out.println("Removed Array List : " + animal);
    }
}
