package in.co.nmsworks.week2.collections;
/**
 *Write a Java program to remove the third element from an array list.
 */

import java.util.ArrayList;
import java.util.List;

public class PQ6 {
    List<String> colors=new ArrayList<String>();
    public void setColor() {
        colors.add("red");
        colors.add("yellow");
        colors.add("green");
        colors.add("black");
        colors.remove(3);
        System.out.println(colors);
}}
