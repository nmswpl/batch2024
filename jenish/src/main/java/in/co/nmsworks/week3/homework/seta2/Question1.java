package in.co.nmsworks.week3.homework.seta2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question1 {
    public void checkRainbowColor() {
        List<String> colorsList = new ArrayList<>();
        colorsList.addAll(Arrays.asList("Violet", "Black", "Indigo", "White", "Blue", "Brown", "Green", "Pink", "Yellow", "Grey", "Orange","Red"));
        List<String> rainbowColorList = new ArrayList<>(Arrays.asList("Violet","Indigo","Blue","Green","Yellow","Orange","Red"));

        for (String color : colorsList) {
            if(rainbowColorList.contains(color)){
                System.out.println(color+" found in Rainbow.");
            }
        }
    }

    public static void main(String[] args) {
        Question1 q1 = new Question1();
        q1.checkRainbowColor();
    }
}