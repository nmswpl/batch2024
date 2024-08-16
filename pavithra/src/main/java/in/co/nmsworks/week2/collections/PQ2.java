package in.co.nmsworks.week2.collections;

import in.co.nmsworks.week2.practice.Employee.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to iterate through all elements in an array list.
 */

public class PQ2 {

    public void setColor() {
        List<String> colors=new ArrayList<String>();
        colors.add("red");
        colors.add("yellow");
        colors.add("green");
        colors.add("black");

        for (String color :colors ) {
            System.out.println(color);

        }

    }







}
