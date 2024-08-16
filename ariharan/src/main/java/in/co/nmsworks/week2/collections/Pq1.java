package in.co.nmsworks.week2.collections;

//. Write a Java program to create an array list, add some colors (strings) and print out the collection.

import java.util.ArrayList;

public class Pq1 {
    public void createArrayListOfColours(){
        ArrayList<String> colours=new ArrayList<>();
        colours.add("yellow");
        colours.add("green");
        colours.add("red");
        colours.add("white");
        colours.add("blue");
        colours.add("red");
        for (int i = 0; i < colours.size(); i++) {
            System.out.println(colours.get(i));

        }


    }
}
