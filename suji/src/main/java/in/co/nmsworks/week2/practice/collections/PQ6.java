package in.co.nmsworks.week2.practice.collections;
//Write a Java program to remove the third element from an array list.

import java.util.ArrayList;

public class PQ6 {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        System.out.println(" Before deletion ");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        colors.remove(3);
        System.out.println(" After deletion ");
        for (int i = 0; i < colors.size(); i++) {
           System.out.println(colors.get(i));
        }
    }
}
