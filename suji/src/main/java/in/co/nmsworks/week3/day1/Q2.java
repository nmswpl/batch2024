package in.co.nmsworks.week3.day1;
import java.util.*;

//Q2:** Write a method that merges two lists of colors, one being List<String> list1 = Arrays.asList("Red", "Green", "Blue") and another being List<String> list2 = Arrays.asList("Yellow", "Black", "White"), such that the resulting list contains all elements from both lists with list1 elements coming before list2 elements. Print the merged list.
public class Q2 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Red", "Green", "Blue");
        List<String> list2 = Arrays.asList("Yellow", "Black", "White");
        List<String> list=new ArrayList<>(list1); //merging 2 2 lists using addAll methos
        list.addAll(list2);

       for (String s:list)
        {
            System.out.println(s);
        }
        System.out.println("The merged list :: "+list);


    }
}
