package in.co.nmsworks.week3.day1;
//*Q1:** Given a list of colors: "Red", "Green", "Blue", "Yellow", "Green", "Blue", write a method to remove all duplicate colors and preserve the original order. Print the resulting list.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q1 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("GReen");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("GReen");
        colors.add("Blue");

       // Set<String> color=new HashSet<>(colors);
        List<String> ls=new ArrayList<>();
       for(String s:colors)
       {
           if(!ls.contains(s))
           {
               ls.add(s);
           }
       }


        for (String s:ls)
        {
            System.out.println(s);
        }

        }
    }

