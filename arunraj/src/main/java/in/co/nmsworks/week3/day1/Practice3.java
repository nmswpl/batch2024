package in.co.nmsworks.week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/***Q3:** Given a list of colors: "Red", "Green", "Blue", "Yellow", "Orange",
 *
 write a method to extract and print a sublist containing the colors from index 1 to index 3 (inclusive).*/

public class Practice3 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        String[] color = {"Red", "Green", "Blue", "Yellow", "Orange"};
        Collections.addAll(colors,color);
        List<String> result = new ArrayList<>();
        int j=0;
        for(String i : colors){
            j++;
            if(j==1 || j==4){
                continue;
            }
            result.add(i);
        }
        System.out.println(result);
    }
}
