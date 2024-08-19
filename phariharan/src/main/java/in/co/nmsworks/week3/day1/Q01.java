package in.co.nmsworks.week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * **Q1:** Given a list of colors: "Red", "Green", "Blue", "Yellow", "Green", "Blue",
 * write a method to remove all duplicate colors and preserve the original order. Print the resulting list.
 */

public class Q01 {
    public static void main(String[] args) {
        List<String> colourList = new ArrayList<>(Arrays.asList(new String[]{"Red", "Green", "Blue", "Yellow", "Green", "Blue"}));
        Q01 q01 = new Q01();
        System.out.println(q01.removeDuplicatesFromList(colourList));
   }
   public List<String> removeDuplicatesFromList(List<String> colourList){
        List<String> colourListWithoutDuplicate = new ArrayList<>();
       for (String value : colourList) {
           if (!colourListWithoutDuplicate.contains(value)) {
               colourListWithoutDuplicate.add(value);
           }
       }
       return colourListWithoutDuplicate;
   }
}
