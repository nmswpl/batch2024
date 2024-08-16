package in.co.nmsworks.week2.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * 5. Write a Java program to update an array element by the given element.
 */
public class Pq5 {

    public void update(){
        List<String> colors=new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Black");
        colors.set(2,"Yellow");
        System.out.println("Updated list :: "+colors);
    }
}
