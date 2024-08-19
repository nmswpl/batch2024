package in.co.nmsworks.week3.assignment.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Write a method that takes a list of lists and returns a single list containing all elements of the nested lists.*/
public class D5 {
    public static void main(String[] args) {
        List<List<Integer>> listOfList = new ArrayList<>();
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(11, 12, 13, 14, 15);
        List<Integer> list3 = Arrays.asList(21, 22, 23, 24, 25);

        listOfList.add(list1);
        listOfList.add(list2);
        listOfList.add(list3);

        System.out.println(listOfList);

        List<Integer> answerList = convert(listOfList);
        System.out.println(answerList);

    }

    public static List<Integer> convert(List<List<Integer>> listOfList)
    {
        List<Integer> newList = new ArrayList<>();
      for(int i = 0; i < listOfList.size(); i++)
      {
          System.out.println(listOfList.get(i));
          newList.addAll(listOfList.get(i));
          System.out.println(newList);
          System.out.println(newList.size());
      }
        return null;
    }
}
