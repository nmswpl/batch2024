package in.co.nmsworks.week2.collections;
//Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.ArrayList;

public class Pq4 {
    public void retriveSpecifiedValue(){
        ArrayList<String > names=new ArrayList<>();
        names.add("ari");
        names.add("haran");
        names.add("vijay");
        names.add("bharathi");
        System.out.println(names);
        System.out.println("third value in the list is::" + names.get(2));
    }
}
