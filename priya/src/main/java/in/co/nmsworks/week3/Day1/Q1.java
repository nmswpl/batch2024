package in.co.nmsworks.week3.Day1;

import java.util.ArrayList;
import java.util.List;

/***Q1:** Given a list of colors: "Red", "Green", "Blue", "Yellow", "Green", "Blue", write a method to remove all duplicate colors and preserve the original order. Print the resulting list.*/
public class Q1 {
    List<String> colors = new ArrayList<>();
    List<String> result = new ArrayList<>();
    public void removeDuplicates() {
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yelow");
        colors.add("Green");
        colors.add("Blue");
      for(String color : colors){
          if(!(result.contains(color))){
              result.add(color);
          }
      }
        System.out.println(result);
    }
    public static void main(String[] args) {
        Q1 q1 = new Q1();
        q1.removeDuplicates();
    }

}
