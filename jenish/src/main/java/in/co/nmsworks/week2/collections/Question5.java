package in.co.nmsworks.week2.collections;

import java.util.ArrayList;

public class Question5 {
    public void displayList(){
        ArrayList<String> flowersList = new ArrayList<>();
        flowersList.add("Rose");
        flowersList.add("Lotus");
        flowersList.add("Jasmine");
        System.out.println("Question 5");
        System.out.println("Before update:: "+flowersList);
        flowersList.set(1,"Sunflower");
        System.out.println("After update:: "+flowersList);
    }
}