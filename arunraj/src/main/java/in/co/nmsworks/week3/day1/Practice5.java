package in.co.nmsworks.week3.day1;

import java.util.ArrayList;
import java.util.List;

/***Q5:** Write a method that takes a list of lists and returns a
 *

single list containing all elements of the nested lists. */

public class Practice5 {
    public static void main(String[] args) {

        List<String> herbivores = new ArrayList<>();
        herbivores.add("Cow");
        herbivores.add("Deer");
        herbivores.add("Goat");

        List<String> carnivores = new ArrayList<>();
        carnivores.add("Lion");
        carnivores.add("Tiger");
        carnivores.add("Bear");

        List<String> animals = new ArrayList<>();

        animals.addAll(herbivores);
        System.out.println(animals);
        animals.addAll(carnivores);
        System.out.println(animals);

        /*List<String> animalList = new ArrayList<>();
        for(String animal : animals){
            animalList.add(animal);
        }
        System.out.println(animalList);*/
    }
}
