package in.co.nmsworks.week3.assignment.day1;

import java.util.Arrays;
import java.util.List;

/***Q4:** Write a method to find the longest color name in a list of colors and return it.*/
public class D4 {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("Red","Blue","Green","Orange");
        int max =0;
        String largestWord = colors.get(0);
        for (String color : colors) {
            if(color.length() >= max){
                max = color.length();
                largestWord = color;
            }
        }

        System.out.println("Largest word:" + largestWord + "\n");


    }
}
