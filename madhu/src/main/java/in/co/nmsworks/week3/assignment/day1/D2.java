package in.co.nmsworks.week3.assignment.day1;
/* Q2:** Write a method that merges two lists of colors,
one being List<String> list1 = Arrays.asList("Red", "Green", "Blue")
and another being List<String> list2 = Arrays.asList("Yellow", "Black", "White"),
such that the resulting list contains all elements from both lists with list1 elements
coming before list2 elements. Print the merged list.
 */
import java.util.ArrayList;
import java.util.List;

public class D2 {
    public static void main(String[] args){
        List<String> list1 =new ArrayList<>();
        list1.add("Red");
        list1.add("Green");
        list1.add("Blue");
        List<String> list2 = new ArrayList<>();
        list2.add("Yellow");
        list2.add("Black");
        list2.add("White");
        list1.addAll(list2);
        System.out.println(list1);

    }

}
