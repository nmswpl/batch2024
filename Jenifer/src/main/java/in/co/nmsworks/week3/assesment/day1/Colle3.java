package in.co.nmsworks.week3.assesment.day1;
/*Given a list of colors: "Red", "Green", "Blue", "Yellow", "Orange",
write a method to extract and print a
sublist containing the colors from index 1 to index 3 (inclusive).
 */

import java.util.ArrayList;
import java.util.List;

public class Colle3 {
    public void printSubList(){
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        List<String> subList = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            subList.add(colors.get(i));
        }
        System.out.println(subList);
    }
}
