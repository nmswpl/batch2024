package in.co.nmsworks.week3.day1;
//**Q2:** Write a method that merges two lists of colors, one being List<String>
//        list1 = Arrays.asList("Red", "Green", "Blue") and another being List<String>
//list2 = Arrays.asList("Yellow", "Black", "White"), such that the resulting
//list contains all elements from both lists with list1 elements coming before list2 elements. Print the merged list.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ques2 {
    public void mergeTwoList(){
        List<String> list1 = Arrays.asList("Red", "Green", "Blue");
        List<String> list2 = Arrays.asList("Yellow", "Black", "White");
        System.out.println(list1);
        System.out.println(list2);
        System.out.println("after merge the two list::");
        List<String> mergedList =new ArrayList<>(list1);
        mergedList.addAll(list2);
        for (String color : mergedList) {
            System.out.println(color);
        }
    }
}
