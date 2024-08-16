package in.co.nmsworks.week2.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to update an array element by the given element.
 */

public class PQ5 {
    List<String> colors=new ArrayList<String>();
    public void setColor() {
        colors.add("red");
        colors.add("yellow");
        colors.add("green");
        colors.add("black");
        colors.set(1,"violet");
        System.out.println(colors);

}}
