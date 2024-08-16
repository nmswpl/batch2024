package in.co.nmsworks.week2.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PQ13 {
    public void iterateArrayList() {
        System.out.println("Q13.");
        Set<String> characters = new HashSet<>();
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
