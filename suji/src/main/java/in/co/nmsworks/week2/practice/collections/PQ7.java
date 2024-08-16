package in.co.nmsworks.week2.practice.collections;
//Write a Java program to search for an element in an array list.


import java.util.ArrayList;

public class PQ7 {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(3);
        values.add(6);
        values.add(8);

        int p=0;
        for (int i = 0; i < values.size(); i++) {
            //  System.out.println(values.get(i));
            if (values.get(i) == 3) {
                p = 1;
            }
        }
        if(p==1)
        {
            System.out.println(" Element found");
        }

        else System.out.println("Element not found");

        }
    }

