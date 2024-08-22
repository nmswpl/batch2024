package in.co.nmsworks.week3.day3hw.setA;
/*
Add the Following Colors to a Collection.
	Violet, Black, Indigo, White, Blue, Brown, Green, Pink, Yellow, Grey, Orange, Red.
   Iterate the collection, Print the "<Color Name> Found in rainbow" if the color is part of rainbow.

 */

import java.util.Arrays;
import java.util.List;

public class Program1 {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("Violet","Black", "Indigo", "White", "Blue", "Brown", "Green", "Pink", "Yellow", "Grey", "Orange", "Red");
        List<String> rainbowColors = Arrays.asList("Violet","Blue","red","Green","Orange","Indigo","yellow");
        for (String color : colors) {
            if(rainbowColors.contains(color)){
                System.out.println(color+" found in rainbow");
            }
        }

    }


}
