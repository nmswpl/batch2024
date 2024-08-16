package in.co.nmsworks.week2.collections;
//Write a Java program to iterate through all elements in an array list.

import java.util.*;

public class Pq2 {
    public void iterateList(){
        ArrayList<Integer> values=new ArrayList<>();
        values.add(11);
        values.add(12);
        values.add(15);
        values.add(11);
        values.add(12);
        for (int i = 0; i <values.size() ; i++) {
            System.out.print(" "+values.get(i));
        }
        System.out.println();
        Set<Integer> values1=new HashSet<>();
//        for (int i = 0; i <10 ; i++) {
//            values1.add(i);
//        }
        values1.add(11);
        values1.add(12);
        values1.add(15);
       for(int val:values1){
           System.out.print(" "+val);
       }


    }
}
