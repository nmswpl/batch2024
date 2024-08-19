package in.co.nmsworks.week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a list of colors: "Red", "Green", "Blue", "Yellow", "Orange",
 * write a method to extract and print a sublist containing the colors from index 1 to index 3 (inclusive).
 */

public class Q03 {
    public static void main(String[] args) {
        List<String> colourList = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Orange"));
        Q03 q03 = new Q03();
        System.out.println(q03.extractByIndex(colourList,1,3));
    }
    public List<String> extractByIndex(List<String> list,int beginningIndex,int endIndex){
        List<String> subList =new ArrayList<>(list.subList(beginningIndex,endIndex+1));
        return subList;
    }
}
