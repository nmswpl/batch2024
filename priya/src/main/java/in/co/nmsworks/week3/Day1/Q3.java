package in.co.nmsworks.week3.Day1;

import java.util.Arrays;
import java.util.List;

/***Q3:** Given a list of colors: "Red", "Green", "Blue", "Yellow", "Orange", write a method to extract and print a sublist containing the colors from index 1 to index 3 (inclusive).*/
public class Q3 {
    List<String> colors = Arrays.asList("Red", "Green", "Blue", "Yellow", "Orange");

    public  void subList() {

        System.out.println(colors.subList(1,4));
    }

    public static void main(String[] args) {
        Q3 q3 = new Q3();
        q3.subList();
    }
}
