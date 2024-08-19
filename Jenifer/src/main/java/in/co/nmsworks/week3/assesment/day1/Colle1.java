package in.co.nmsworks.week3.assesment.day1;
/* Given a list of colors: "Red", "Green", "Blue", "Yellow", "Green", "Blue",
write a method to remove all duplicate colors and preserve the original order.
Print the resulting list.
 */

import in.co.nmsworks.week2.practice.employee.Se;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Colle1 {
    List<String> result = new ArrayList<>();

    public void removeDup() {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");

        for (String color : colors) {
            if (!result.contains(color)) {
                result.add(color);
            }
        }
        System.out.println(result);
    }
}
