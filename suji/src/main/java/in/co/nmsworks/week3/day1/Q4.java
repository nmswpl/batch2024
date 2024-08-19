package in.co.nmsworks.week3.day1;
import java.util.*;

//*Q4:** Write a method to find the longest color name in a list of colors and return it.
public class Q4 {
    public static void main(String[] args) {
        List<String> colors=new ArrayList<>();

        colors.add("Red");
        colors.add("GReen");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("PInk");
        colors.add("Lavender");

        String largestWord = "";
    for(String s:colors)
    {
            if (s.length() > largestWord.length()) {
                largestWord = s;
            }
        }

        System.out.println("The largest word in the list  :: "+largestWord);
    }
}
