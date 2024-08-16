package in.co.nmsworks.week2.practice.collections;
//Write a Java program to create an array list, add some colors (strings) and print out the collection.

import java.util.ArrayList;

public class PQ1 {
    //  String s;

    public static void main(String[] args) {
        //public String display
        {
            // this.s=s;
            ArrayList<String> colors = new ArrayList<>();
            colors.add("Blue");
            colors.add("Pink");
            colors.add("White");
            colors.add("Red");

            for (int i = 0; i < colors.size(); i++) {
                System.out.println(colors.get(i));
            }

        }

    }
}

