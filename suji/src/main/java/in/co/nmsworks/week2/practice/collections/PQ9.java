package in.co.nmsworks.week2.practice.collections;

import java.util.ArrayList;

public class PQ9 {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(3);
        values.add(6);
        values.add(8);

      ArrayList<Integer> numbers=new ArrayList<>(values);

      System.out.print(" Original List ");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(" "+numbers.get(i));
        }
        System.out.println(" Reversed List ");

        for (int i = numbers.size()-1; i >=0; i--) {
            System.out.print(" "+numbers.get(i));
        }
        }
    }

