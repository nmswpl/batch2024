package in.co.nmsworks.week2.collections;

import java.util.ArrayList;

public class Question6 {
    public void displayList(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        System.out.println("Question 6");
        System.out.println("Before update:: "+numbers);
        numbers.remove(2);
        System.out.println("After update:: "+numbers);
    }
}