package in.co.nmsworks.week2.collection;
// Write a Java program to search for an element in an array list.

import java.util.ArrayList;
import java.util.List;

public class Pq7 {
    public void searchElement() {
        List<String> animal = new ArrayList<>();
        animal.add("Cow");
        animal.add("Dog");
        animal.add("Cat");
        animal.add("Lion");
        animal.add("Tiger");
        animal.add(2, "Horse");
        System.out.println("Search Array List : " + animal.contains("Cow"));
    }
}
