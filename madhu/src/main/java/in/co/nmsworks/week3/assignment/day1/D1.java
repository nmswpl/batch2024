package in.co.nmsworks.week3.assignment.day1;

import java.util.ArrayList;
import java.util.List;

/* Q1:** Given a list of colors: "Red", "Green", "Blue", "Yellow", "Green", "Blue",
write a method to remove all duplicate colors and preserve the original order.
Print the resulting list.
 */
public class D1 {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        List<String> result = new ArrayList<>();
        for (String clr : colors) {
            if (result.contains(clr)) {
                continue;
            }
            else {
                result.add(clr);
                System.out.println(result);
            }



        }

    }
}


