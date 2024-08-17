package in.co.nmsworks.week2.collections;

import java.util.ArrayList;

public class Question9 {
    public void displayList() {
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(8);
        numbersList.add(6);
        numbersList.add(5);
        numbersList.add(4);
        int size = numbersList.size() - 1;
        System.out.println("Original List :: "+numbersList);
        System.out.println("Reversed List :: ");
        for (int i = size ; i >= 0 ; i--) {
            System.out.println(numbersList.get(i));
        }
    }
}