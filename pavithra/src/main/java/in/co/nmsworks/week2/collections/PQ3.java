package in.co.nmsworks.week2.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Write a Java program to insert an element into the array list at the first position.
 */

public class PQ3 {
    List<String> colors=new ArrayList<String>();
    public void setColor() {
        colors.add("red");
        colors.add("yellow");
        colors.add("green");
        colors.add("black");
        System.out.println("Before: "+ colors);
        colors.add(0,"violet");
        System.out.println("After insert: "+colors);
        System.out.println(colors);



}
    Set<String> color=new HashSet<>();
    public void setColor1() {
        color.add("red");
        color.add("yellow");
        color.add("green");
        color.add("black");
        System.out.println("Before: "+ color);
        color.add("violet");
        System.out.println("After insert: "+colors);
        System.out.println(color);
}}
