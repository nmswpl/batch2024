package in.co.nmsworks.week2.practice.collections;

//Write a Java program to update an array element by the given element.
import java.util.ArrayList;

public class PQ5 {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(3);
        values.add(6);
        values.add(8);


        values.set(2, 89);
        System.out.println("Update an array element by the given element");
        for (int i = 0; i < values.size(); i++) {
            System.out.println(values.get(i));
        }
    }
}
