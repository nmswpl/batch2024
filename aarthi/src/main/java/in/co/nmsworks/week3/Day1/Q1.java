package in.co.nmsworks.week3.Day1;
/*
Given a list of colors: "Red", "Green", "Blue", "Yellow", "Green", "Blue",
 write a method to remove all duplicate colors and preserve the original order. Print the resulting list.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q1 {
    List<String> colors = new ArrayList<>();
    List<String>resultList = new ArrayList<>();
    public void colors() {
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");
        colors.add("green");
        colors.add("blue");
        for (int i = 0; i < colors.size(); i++) {
            if(resultList.contains(colors.get(i))) {
                continue;
            }else{
                resultList.add(colors.get(i));
            }
        }System.out.println(resultList);

    }

    public static void main(String[] args) {

        Q1 colorlist = new Q1();
        colorlist.colors();



        }

    }


