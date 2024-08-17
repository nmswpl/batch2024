package in.co.nmsworks.week2.collections;

import java.util.ArrayList;

public class Question7 {
    ArrayList<Integer> numbersList = new ArrayList<>();
    public void displayList(){
        numbersList.add(4);
        numbersList.add(7);
        numbersList.add(6);
        numbersList.add(5);
        numbersList.add(3);
        System.out.println("Question 7");
    }

    public void findElement(int searchElement){
        for (Integer i : numbersList) {
            if(i == searchElement){
                System.out.println("Element Found.");
                return;
            }
        }
        System.out.println("Not Found !!");
    }
}