package in.co.nmsworks.week2.practice.collections;

//Write a Java program to insert an element into the array list at the first position.
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PQ3 {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        System.out.println("Before insertion of the element");
        for(int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

     colors.add(1,"GREEN");

     System.out.println("After insertion of the element");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }
}


