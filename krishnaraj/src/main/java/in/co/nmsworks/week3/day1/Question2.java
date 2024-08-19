package in.co.nmsworks.week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/***
 * Write a method that merges two lists of colors, one being List<String> list1 = Arrays.asList("Red", "Green", "Blue")
 * and another being List<String> list2 = Arrays.asList("Yellow", "Black", "White"), such that the resulting list
 * contains all elements
 * from both lists with list1 elements coming before list2 elements. Print the merged list.
 */
public class Question2 {
    public void mergingElement(){
        List<String> list1 = Arrays.asList("Red", "Green", "Blue");
        List<String> list2 = Arrays.asList("Yellow", "Black", "White");
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            resultList.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            resultList.add(list2.get(i));
        }
        System.out.println("List1 :"+list1);
        System.out.println("List2 :"+list2);
        System.out.println("MergedLIst :"+resultList);
    }

    public static void main(String[] args) {
        Question2 question2 = new Question2();
        question2.mergingElement();
    }
}
