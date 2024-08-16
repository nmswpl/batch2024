package in.co.nmsworks.week2.collections;
//Write a Java program to create Set, add some colors (strings) and print out the collection.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Pq12 {
    public void HashSetOfColours(){
        Set<String> colours=new HashSet<>();
        colours.add("yellow");
        colours.add("green");
        colours.add("red");
        colours.add("white");
        colours.add("blue");
        for(String colour:colours){
            System.out.println(colour);
        }


    }
}
