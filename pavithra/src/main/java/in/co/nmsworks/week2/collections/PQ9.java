package in.co.nmsworks.week2.collections;
/**
 * Write a Java program to print reverse elements in an array list.
 */

import java.util.ArrayList;
import java.util.List;

public class PQ9 {
    List<String> colors=new ArrayList<String>();
    public void setColor() {
        colors.add("red");
        colors.add("yellow");
        colors.add("green");
        colors.add("black");

        for (int i = colors.size(); i>0; i--) {
            System.out.println(colors);

        }
}}
