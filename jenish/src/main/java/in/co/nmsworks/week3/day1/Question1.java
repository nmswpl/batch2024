package in.co.nmsworks.week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question1 {
    public void removeDuplicates(){
        List<String> colorsList = new ArrayList<>();
        colorsList.addAll(Arrays.asList("Red","Green","Blue","Yellow","Green", "Blue"));

        List<String> colorsList1 = new ArrayList<>();

        for (int i = 1; i < colorsList.size(); i++) {
            String color = colorsList.get(i);
            if (colorsList1.contains(color)) {
                break;
            }
            else {
                colorsList1.add(color);
            }
        }
        System.out.println(colorsList);
    }
}