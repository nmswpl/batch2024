package in.co.nmsworks.week2.collections;

import java.util.ArrayList;
import java.util.List;

public class Question3 {
    public void displayList() {
        List<Integer> numList = new ArrayList<>();
        numList.add(3);
        numList.add(2);
        numList.add(1);
        System.out.println("Question 3");
        System.out.println("Before Insertion :: "+numList);
        numList.add(0,4);
        System.out.println("After Insertion :: "+numList);
        numList.set(0,7);
        System.out.println("After Update(set) :: "+numList);
    }
}