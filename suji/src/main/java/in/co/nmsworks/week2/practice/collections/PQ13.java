package in.co.nmsworks.week2.practice.collections;

import java.util.HashSet;
import java.util.Set;

public class PQ13 {
    public static void main(String[] args) {

    Set<String> color=new HashSet<>();
        color.add("Blue");
        color.add("White");
        color.add("Black");
        color.add("Red");
        System.out.println("Before insertion of the element");
        for(String s:color) {
            System.out.println(s);
        }
        color.add("GREEN");

     System.out.println("After insertion of the element");
        for(String s:color) {
            System.out.println(s);
        }

}
        }

