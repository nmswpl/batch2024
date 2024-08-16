package in.co.nmsworks.week2.collections;
//Write a Java program to print reverse elements in an array list.

import java.util.ArrayList;

public class Pq9 {
    public void reverseArrayList(){
        ArrayList<Integer> values=new ArrayList<>();
        values.add(3);
        values.add(4);
        values.add(5);
        values.add(6);
        values.add(7);
        values.add(8);
        System.out.println(values);
        System.out.println("reversed list::");

        for (int i = values.size()-1; i >=0; i--) {
            System.out.print( " " +values.get(i));
        }
    }
}
