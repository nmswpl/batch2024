package in.co.nmsworks.week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question5 {

    //Write a method that takes a list of lists and returns a single list containing all elements of the nested lists.

    public Question5(){
        List<List<Integer>> listOfList = new ArrayList<>();


        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(6,7,8,9,10));

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(11,12,13,14,15));

        listOfList.add(list1);
        listOfList.add(list2);
        listOfList.add(list3);


        List<Integer> totalNumberList = new ArrayList<>();

        for(int i =0;i<listOfList.size();i++){
            for(int j =0;j<listOfList.get(i).size();j++) {
                totalNumberList.add(listOfList.get(i).get(j));
            }
        }

        System.out.println("Final List: " +totalNumberList +"\n");
    }
}
