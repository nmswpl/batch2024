package in.co.nmsworks.week3.Day1;
/*
Write a method to find the longest color name in a list of colors and return it.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q4 {
    public void stringlen() {
        List<String> color = Arrays.asList("Red", "Green", "Blue", "Yellow", "Orange");
        int max=0;
        int index=0;

        for (int i = 0; i < color.size(); i++) {
            if(max<=color.get(i).length()){
                max=color.get(i).length();
                index=i;
            }

        }System.out.println(color.get(index));

    }

    public static void main(String[] args) {
        Q4 strlen = new Q4();
        strlen.stringlen();
    }
}
