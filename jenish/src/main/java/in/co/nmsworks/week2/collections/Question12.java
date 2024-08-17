package in.co.nmsworks.week2.collections;

import java.util.HashSet;
import java.util.Set;

public class Question12 {
    public void displaySet() {
        Set<String> colors = new HashSet<>();
        colors.add("Vanilla");
        colors.add("Chocolate");
        colors.add("Butterscotch");
        colors.add("BlackCurrent");
        System.out.println("Set Colors ::");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}