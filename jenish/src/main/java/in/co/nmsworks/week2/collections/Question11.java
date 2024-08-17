package in.co.nmsworks.week2.collections;

import java.util.ArrayList;

public class Question11 {
    public void displayList() {
        ArrayList<Integer> numbersList1 = new ArrayList<>();
        ArrayList<Integer> numbersList2 = new ArrayList<>();
        numbersList1.add(4);
        numbersList1.add(2);
        numbersList1.add(5);
        numbersList2.add(7);
        numbersList2.add(11);
        numbersList2.add(9);
        numbersList1.addAll(numbersList2);
        System.out.println(numbersList1);
    }
}