package in.co.nmsworks.week2.collection;
/*
9. Write a Java program to print reverse elements in an array list.
 */

import java.util.ArrayList;
import java.util.List;

public class Pq9 {
    List<String> subjects9 = new ArrayList<String>();

    public void setSubjects9() {
        subjects9.add("Tamil");
        subjects9.add("English");
        subjects9.add("Maths");
        subjects9.add("Science");
        for (int i = subjects9.size() - 1; i >0; i--)
        {
            System.out.println(subjects9.get(i));
        }
    }
}
