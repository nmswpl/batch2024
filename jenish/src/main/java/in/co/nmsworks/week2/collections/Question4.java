package in.co.nmsworks.week2.collections;

import java.util.ArrayList;
import java.util.List;

public class Question4 {
    public void displayList() {
        List<String> foodItemList = new ArrayList<>();
        foodItemList.add("Briyani");
        foodItemList.add("Chicken Rice");
        foodItemList.add("parotta");
        System.out.println("Question 4");
        System.out.println(foodItemList.get(1));
    }
}