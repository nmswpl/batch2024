package in.co.nmsworks.week2.collections;

import java.util.ArrayList;

/*
2. Write a Java program to iterate through all elements in an array list.
 */
public class PQ2 {

    public void iterateArrayList() {
        System.out.println("Q2.");
        ArrayList<String> characters = new ArrayList<>();
        characters.add("Naruto");
        characters.add("Eren Yeager");
        characters.add("Sasuke");
        characters.add("Levi");
        characters.add("Ichigo");

        for (String character : characters) {

            System.out.println(character);

        }
    }
}
