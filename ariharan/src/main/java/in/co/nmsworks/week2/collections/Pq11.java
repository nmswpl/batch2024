package in.co.nmsworks.week2.collections;
//Write a Java program to join two array lists.

import java.util.ArrayList;

public class Pq11 {
    public void joinTwoArray(){
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
        System.out.println(ids1);
        System.out.println(ids2);
        System.out.println("after join::");
        ids2.addAll(ids1);
        for (int i = 0; i < ids2.size(); i++) {
            System.out.println(ids2.get(i));

        }
    }

}
