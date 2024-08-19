package in.co.nmsworks.week3.day1;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a method to find the longest color name in a list of colors and return it.
 */
public class Question4 {
    public void longestColorName() {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        int indexvalue = 0;
        int maxSize = colors.get(0).length();
        for (int i = 1; i < colors.size(); i++) {
            if (colors.get(i).length() > maxSize) {
                maxSize = colors.get(i).length();
                indexvalue = i;
            }
        }
        System.out.println("The longest name in list : " + colors.get(indexvalue));
    }

    public static void main(String[] args) {
        Question4 question4 = new Question4();
        question4.longestColorName();
    }
}
