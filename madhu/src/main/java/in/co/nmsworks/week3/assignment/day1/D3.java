package in.co.nmsworks.week3.assignment.day1;

import java.util.ArrayList;
import java.util.List;

/*Given a list of colors: "Red", "Green", "Blue", "Yellow", "Orange",
write a method to extract and print a sublist
containing the colors from index 1 to index 3 (inclusive).
 */
public class D3 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        List<String> subColors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Orange");
        for (int i = 1; i <= 3; i++) {
            subColors.add(colors.get(i));
        }
        System.out.println(subColors);
    }
}

