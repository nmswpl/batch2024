package in.co.nmsworks.week3.assessment.day1;
/**
 * Write a method that takes a list of lists and returns a single list containing all elements of the nested lists.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question5 {
    public void listElement(){
        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(11,12,13,14,15);
        List<Integer> list3 = Arrays.asList(21,22,23,24,25);


        List<List<Integer>> results = new ArrayList<>();
        results.add(list1);
        results.add(list2);
        results.add(list3);
        System.out.println(results);

        List<Integer> nestedList = convert(results);
        System.out.println(nestedList);

        List<Integer> listFinal = new ArrayList<>();
        listFinal.addAll(list1);
        listFinal.addAll(list2);
        listFinal.addAll(list3);
        System.out.println(listFinal);
        System.out.println(listFinal.size());
    }

    private List<Integer> convert(List<List<Integer>> results)
    {

        for(List<Integer> i: results){
            System.out.println(i);

        }
        return null;
    }
}
