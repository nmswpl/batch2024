package in.co.nmsworks.week3.assessment.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * **Q4:** Write a method to find the longest color name in a list of colors and return it.
 */

public class Question4 {
    public static void main(String[] args) {
        List<String> colorList = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Black"));
        int count = 0;
        int index = 0;

        for (String s : colorList) {
            if(s.length()>count){
                count = s.length();
                index++;
            }

        }
        System.out.println(colorList.get(index));

    }


}
