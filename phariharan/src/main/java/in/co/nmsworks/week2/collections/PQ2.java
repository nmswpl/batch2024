package in.co.nmsworks.week2.collections;

import java.util.HashSet;
import java.util.Set;

/**
 * Write a Java program to iterate through all elements in an array list.
 */
public class PQ2 {
    public void displayColours(PQ1 obj){
        for (int i = 0; i < obj.colourList.size() ; i++) {
            System.out.println(obj.colourList.get(i));
        }
    }
    public Set<String> colours = new HashSet<>();
    public void addColourSet(String colour){
        colours.add(colour);
    }
    public void displaySet(){
        for(String values : colours){
            System.out.println(values);
        }
    }
}
