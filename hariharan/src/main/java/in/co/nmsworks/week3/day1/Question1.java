package in.co.nmsworks.week3.day1;

import java.util.*;

public class Question1 {

    //Given a list of colors: "Red", "Green", "Blue", "Yellow", "Green", "Blue", write a method to remove all duplicate colors and preserve the original order. Print the resulting list.

    public Question1() {


        List<String> colors = new ArrayList<>();
        colors.addAll(Arrays.asList("Red", "Green", "Blue", "Yellow", "Green", "Blue"));

       for(int i = colors.size()-1;i>=0;i--){
           List<String> colorsSublist = colors.subList(0,i);
           if(colorsSublist.contains(colors.get(i))){
               colors.remove(colors.get(i));
           }
       }

        System.out.println("Colors After Duplicates removed:" +colors+ "\n");

    }
}
