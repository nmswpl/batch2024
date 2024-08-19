package in.co.nmsworks.week3.day1;
//**Q5:** Write a method that takes a list of lists and returns a single
//list containing all elements of the nested lists.

import java.util.ArrayList;
import java.util.List;

public class Ques5 {
    public void printValuesInNestedList(){
        List<List<Integer>> values=new ArrayList<>();
        List<Integer> valuesOfList1=new ArrayList<>();
        List<Integer> valuesOfList2=new ArrayList<>();
        List<Integer> valuesOfList3=new ArrayList<>();
        for (int i = 1; i <=30 ; i++) {
            if(i<11)
                valuesOfList1.add(i);
            else if (i<21)

                valuesOfList2.add(i);

            else

                valuesOfList3.add(i);
        }
        values.add(valuesOfList1);
        values.add(valuesOfList2);
        values.add(valuesOfList3);
        System.out.println(values);
        List<Integer> allElementsInList=new ArrayList<>();
        for (List<Integer> value : values) {
            allElementsInList.addAll(value);
        }
        System.out.println("all element in a single List::");
        for (Integer value : allElementsInList) {
            System.out.println(value);

        }
        System.out.println(allElementsInList);

    }
}
