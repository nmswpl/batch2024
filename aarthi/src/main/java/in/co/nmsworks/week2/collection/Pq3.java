package in.co.nmsworks.week2.collection;
/*
Write a Java program to insert an element into the array list at the first position.
 */

import java.util.ArrayList;
import java.util.List;

public class Pq3 {
    List<String> subjects1= new ArrayList<String>();

    public void setSubjects1()
    {
        subjects1.add("Tamil");
        subjects1.add("English");
        subjects1.add("Maths");
        subjects1.add("Science");

        System.out.println("This will list the subjects::" + subjects1);
        subjects1.add(0,"social");
        System.out.println("This will show after list the subjects::" + subjects1);

    }
}
