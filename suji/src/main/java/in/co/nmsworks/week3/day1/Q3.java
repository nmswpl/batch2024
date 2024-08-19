package in.co.nmsworks.week3.day1;
import java.util.*;

//* Given a list of colors: "Red", "Green", "Blue", "Yellow", "Orange", write a method to extract and print a sublist containing the colors from index 1 to index 3 (inclusive).
public class Q3 {
    public static void main(String[] args) {
        List<String> colors=Arrays.asList("REd","Green","Blue","Yellow","Orange");
        String []s={"REd","Green","Blue","Yellow","Orange"};

        List<String> subColors=new ArrayList<>(); //to create a new sublist using add()
       /* for (int i = 1; i < 4; i++) {           //to get from array

            subColors.add(s[i]);
        } */

        for (int i = 1; i < 4; i++) {             //to get from list itself
            subColors.add(colors.get(i));
        }

        System.out.println("The extracted list from index 1-3(inclusive) :: "+subColors);

    }
}
