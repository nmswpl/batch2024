package in.co.nmsworks.week3.assesment.day1;
/* Write a method that takes a list of lists and returns a single
list containing all elements of the nested lists. */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Colle5 {
    public void listElement(){
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        List<Integer> list2 = new ArrayList<>();
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);

        List<List> result = new ArrayList<>();
        result.addAll(Collections.singleton(list1));
        result.addAll(Collections.singleton(list2));

        System.out.println(result);
    }
}
