package in.co.nmsworks.week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question2 {
    public void addList(){
        List<String> list1 = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        List<String> list2 = new ArrayList<>(Arrays.asList("Yellow", "Black", "White"));

        for (String color : list2) {
            list1.add(color);
        }
        System.out.println(list1);
    }
}
