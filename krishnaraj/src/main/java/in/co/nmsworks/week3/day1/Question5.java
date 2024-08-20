package in.co.nmsworks.week3.day1;

import java.util.ArrayList;
import java.util.List;

/***
 * Write a method that takes a list of lists and returns a single list containing all elements of the nested lists.
 */
public class Question5 {
    public void combineNestedLoop() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        List<List> nestedList= new ArrayList<>();
        nestedList.add(list1);
        nestedList.add(list1);
        nestedList.add(list1);

        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < nestedList.size(); i++) {
            for (int j = 0; j < nestedList.get(i).size(); j++) {
                resultList.add((Integer) nestedList.get(i).get(j));
            }
        }

        System.out.println("Added the nested list : " + resultList);
    }
    public static void main(String[] args) {
        Question5 question5 = new Question5();
        question5.combineNestedLoop();
    }
}
