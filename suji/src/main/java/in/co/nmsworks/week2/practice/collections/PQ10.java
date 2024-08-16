package in.co.nmsworks.week2.practice.collections;

import java.util.ArrayList;
import java.util.Collections;

public class PQ10 {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(3);
        values.add(6);
        values.add(8);

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(7);
        numbers.add(8);

        System.out.println("Result of the comparison  "+ values.equals(numbers));
        }
    }

