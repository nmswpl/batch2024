package in.co.nmsworks.week2.collection;
// Write a Java program to iterate through all elements in an array list.

import java.util.ArrayList;
import java.util.List;

public class Pq2 {
    public void iteration(){
        List<String> animal = new ArrayList<>();
        animal.add("Cow");
        animal.add("Dog");
        animal.add("Cat");
        animal.add("Lion");
        animal.add("Tiger");
        for (int i = 0; i < animal.size(); i++) {
            System.out.println(animal.get(i));
        }
    }
}
