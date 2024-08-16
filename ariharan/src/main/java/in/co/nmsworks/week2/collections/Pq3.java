package in.co.nmsworks.week2.collections;
//Write a Java program to insert an element into the array list at the first position.

import java.util.ArrayList;

public class Pq3 {
    public void insertAtFirstPosition(){
    ArrayList<Integer> values=new ArrayList<>();
    values.add(3);
    values.add(4);
    values.add(5);
    System.out.println("before inserted::");
    for (int i = 0; i <values.size() ; i++) {
        System.out.print(" "+values.get(i));
        }
    values.add(0,2);
    System.out.println();
    System.out.println("after inserted::");
    for (int i = 0; i <values.size() ; i++) {
        System.out.print(" "+values.get(i));
    }
    System.out.println();

    System.out.println("Set the value in list");
    System.out.println("before set::");
    for (int i = 0; i <values.size() ; i++) {
        System.out.print(" "+values.get(i));
    }
    values.set(0,10);
    System.out.println();
    System.out.println("after the set the value in list::");
    for (int i = 0; i <values.size() ; i++) {
        System.out.print(" "+values.get(i));
    }




}
}
