package in.co.nmsworks.week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Write a method that merges two lists of colors, one being List<String> list1 = Arrays.asList("Red", "Green", "Blue")
 * and another being List<String> list2 = Arrays.asList("Yellow", "Black", "White"),
 * such that the resulting list contains all elements from both lists with list1 elements coming before list2 elements.
 * Print the merged list.
 */

public class Q02 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        List<String> list2 = new ArrayList<>(Arrays.asList("Yellow", "Black", "White"));
        Q02 q02 =new Q02();
        System.out.println(q02.mergeLists(list1,list2));
    }
    public List<String> mergeLists(List<String> list1 ,List<String> list2){
        list1.addAll(list2);
        return list1;
    }
}
