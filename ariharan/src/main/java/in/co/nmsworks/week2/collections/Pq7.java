package in.co.nmsworks.week2.collections;
//Write a Java program to search for an element in an array list.

import java.util.ArrayList;

public class Pq7 {
    public void searchElement(String searchelem){
        ArrayList<String> colours=new ArrayList<>();
        colours.add("yellow");
        colours.add("green");
        colours.add("red");
        colours.add("white");
        colours.add("blue");
        colours.add("orange");
        colours.add("black");
        colours.add("purple");
        if(colours.contains(searchelem)){
            System.out.println("the element is present in list");
        }
        else{
            System.out.println("the element is not present");
        }
    }

}
