package in.co.nmsworks.week2.collections;

import java.util.ArrayList;

/**
 * Write a Java program to create an array list, add some colors (strings) and print out the collection.
 */

public class PQ1 {
    public ArrayList<String> colourList = new ArrayList<>();
    public void addColours(String colours){
        colourList.add(colours);
    }
    public void displayDetails(){
        for (int i = 0; i < colourList.size(); i++) {
            System.out.println(colourList.get(i));
        }
    }
}
