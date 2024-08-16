package in.co.nmsworks.week2.collection;
/*
Write a Java program to iterate through all elements in an array list.
 */

import java.util.ArrayList;
import java.util.List;

public class Pq2 {
    List<String> subjects = new ArrayList<String>();

    public void setSubjects()
    {
        List<String> subjects = new ArrayList<String>();
        subjects.add("Tamil");
        subjects.add("English");
        subjects.add("Maths");
        subjects.add("Science");



        for (int i = 0; i < subjects.size(); i++)
        {
            System.out.println(subjects.get(i));
        }


    }
}
