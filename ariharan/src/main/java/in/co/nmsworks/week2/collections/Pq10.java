package in.co.nmsworks.week2.collections;
//Write a Java program to compare two array lists.

import java.util.ArrayList;

public class Pq10 {
    public void compareTwoArraylists(){
        ArrayList<Integer> ids1=new ArrayList<>();
        ids1.add(1);
        ids1.add(2);
        ids1.add(3);
        ids1.add(4);
        ids1.add(5);
        ArrayList<Integer> ids2=new ArrayList<>();
        ids2.add(1);
        ids2.add(2);
        ids2.add(3);
        ids2.add(4);
        ids2.add(5);
        if(ids1.equals(ids2)){
            System.out.println("two arrays are same");
        }
        else{
            System.out.println("two arrays are not same");
        }
    }
}
