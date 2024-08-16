package in.co.nmsworks.week2.collections;
//Write a Java program to remove the third element from an array list.

import java.util.ArrayList;

public class Pq6 {
    public void remove3Element(){
        ArrayList<String> colours=new ArrayList<>();
        colours.add("yellow");
        colours.add("green");
        colours.add("red");
        colours.add("white");
        colours.add("blue");
        System.out.println("before update::"+colours);
        colours.remove(2);
        System.out.println("after remove third element in the list");
        for (int i = 0; i <colours.size() ; i++) {
            System.out.println(colours.get(i));
        }
    }
}
