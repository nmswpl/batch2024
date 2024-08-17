package in.co.nmsworks.week2.collections;

import java.util.ArrayList;

public class Question10 {
    public void displayList() {
        ArrayList<Integer> numbersList = new ArrayList<>();
        ArrayList<Integer> numbersList1 = new ArrayList<>(numbersList);
        numbersList.add(10);
        numbersList.add(2);
        numbersList.add(4);
        numbersList.add(1);

        if(numbersList.containsAll(numbersList1)){
            System.out.println("Both are same");
        }
        else{
            System.out.println("Not same");
        }
    }
}