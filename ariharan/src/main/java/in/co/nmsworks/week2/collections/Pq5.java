package in.co.nmsworks.week2.collections;

//Write a Java program to update an array element by the given element.

import java.util.ArrayList;

public class Pq5 {
    public void updateList(){
        ArrayList<String> colours=new ArrayList<>();
        colours.add("yellow");
        colours.add("green");
        colours.add("red");
        colours.add("white");
        colours.add("blue");
        System.out.println("before update::");
        for (int i = 0; i <colours.size() ; i++) {
            System.out.println(colours.get(i));
        }
        colours.add("orange");
        colours.add("black");
        colours.remove("blue");
        System.out.println("after updated:");
        for (int i = 0; i <colours.size() ; i++) {
            System.out.println(colours.get(i));
        }
    }
}
