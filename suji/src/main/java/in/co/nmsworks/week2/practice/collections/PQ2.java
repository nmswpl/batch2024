package in.co.nmsworks.week2.practice.collections;

//Write a Java program to iterate through all elements in an array list.
//
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PQ2 {
    public static void main(String[] args) {
        ArrayList<Integer> values=new ArrayList<>();

        values.add(1);
        values.add(3);
        values.add(6);
        values.add(8);

        System.out.println("The values in the list");
        for (int i = 0; i < values.size(); i++) {
            System.out.println(values.get(i));
        }

        Set<Integer> num=new HashSet<>();
        System.out.println("The values in the SEt");
        num.add(8);
        num.add(98);
        num.add(54);
       for (int i:num)
       {
           System.out.println(i);
       }





    }
}
