package in.co.nmsworks.week2.collections;

import java.util.*;

public class Question2 {
    public void displayList(){
        List<String> namesList = new ArrayList<>();
        Set<String> namesList1 = new HashSet<>();
        namesList.add("Jeff");
        namesList.add("Sam");
        namesList.add("Jen");
        namesList1.add("Jeff");
        namesList1.add("Sam");
        namesList1.add("Jen");
        Iterator<String> iterator = namesList.iterator();
        System.out.println("Question 2");
        System.out.println("ArrayList elements ::");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Iterator<String> iterator1 = namesList1.iterator();
        System.out.println("Set elements ::");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}