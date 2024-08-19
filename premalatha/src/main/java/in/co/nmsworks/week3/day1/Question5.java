package in.co.nmsworks.week3.day1;
/*
Write a method that takes a list of lists and returns a single list containing all elements of the nested lists.
 */

import java.util.ArrayList;
import java.util.List;

public class Question5 {
    public void listOfList(){
        List<Integer> list1 = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list1.add(i);
        }

        List<Integer> list2 = new ArrayList<>();
        for (int i = 6; i <=15 ; i++) {
            list2.add(i);
        }

        List<Integer> list3 = new ArrayList<>();
        for (int i = 16; i <=20 ; i++) {
            list3.add(i);
        }

        List<List<Integer>> listOfList = new ArrayList<>();
        listOfList.add(list1);
        listOfList.add(list2);
        listOfList.add(list3);


        List<Integer> answerList = convert(listOfList);
        System.out.println(answerList);
    }

    private List<Integer> convert(List<List<Integer>> listOfList) {
        List<Integer> finalList = new ArrayList<>();
        for (List<Integer> integerList : listOfList) {
            System.out.println(integerList);
            for (Integer integer : integerList) {
                finalList.add(integer);
            }
        }
        System.out.println(finalList.size());
        return finalList;

    }


}
