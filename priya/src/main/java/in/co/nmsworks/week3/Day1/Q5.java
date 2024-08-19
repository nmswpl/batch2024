package in.co.nmsworks.week3.Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/***Q5:** Write a method that takes a list of lists and returns a single list containing all elements of the nested lists.*/
public class Q5 {
    public void printSingleList(){
        List<List<Integer>> nestedList = new ArrayList<>();
        List<Integer> finalList = new ArrayList<>();
        nestedList.add(Arrays.asList(1,2,3,4));
        nestedList.add(Arrays.asList(5,6,7,8));
        nestedList.add(Arrays.asList(9,10));
        System.out.println(nestedList);
        for(List<Integer> list : nestedList){
            finalList.addAll(list);
        }
        System.out.println(finalList);
    }

    public static void main(String[] args) {
        Q5 q5 = new Q5();
        q5.printSingleList();
    }

}
