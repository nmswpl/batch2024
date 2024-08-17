package in.co.nmsworks.week2.collections;

import java.util.ArrayList;

public class Question8 {
    public void displayList() {
        ArrayList<String> fruitsList = new ArrayList<>();
        ArrayList<String> eatables = new ArrayList<>();
        fruitsList.add("Apple");
        fruitsList.add("Guava");
        fruitsList.add("Grapes");
        System.out.println("Question 8");
        System.out.println("Original List :: "+fruitsList);
        for (String s : fruitsList) {
            eatables.add(s);
        }
        System.out.println("Copied List :: "+eatables);
    }
}