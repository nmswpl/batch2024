package in.co.nmsworks.week3.day1;

import java.util.*;

/***Q1:** Given a list of colors: "Red", "Green", "Blue", "Yellow",
 "Green", "Blue", write a method to remove all duplicate colors and preserve the original order.
 Print the resulting list. */

public class Practice1 {
    public static void main(String[] args) {
        //Set<String> colors = new HashSet<>();
        List<String> colors = new ArrayList<>();
        String[] color = {"Red","Green","Blue","Yellow","Green","Blue"};
        Collections.addAll(colors, color);
        List<String> result = new ArrayList<>();
        for(String i : colors){
            if(result.contains(i)){
                continue;
            }
            else {
                result.add(i);
            }
        }
        for(String i:result){
            System.out.println(i);
        }
    }
}
