package in.co.nmsworks.week2.collections;

import java.util.ArrayList;

//Write a Java program to copy one array list into another.
public class Pq8 {
    public void copyList(){
        ArrayList<Integer> ids1=new ArrayList<>();
        ids1.add(1);
        ids1.add(2);
        ids1.add(3);
        ids1.add(4);
        ids1.add(5);
        ids1.add(6);
        ArrayList<Integer> ids2=new ArrayList<>();
        for (int i = 0; i <ids1.size() ; i++) {
            ids2.add(ids1.get(i));

        }
        System.out.println("ids1::"+ids1);
        System.out.println("ids2::"+ids2);
    }
}
