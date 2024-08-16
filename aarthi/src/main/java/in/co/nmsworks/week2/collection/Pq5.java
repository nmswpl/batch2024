package in.co.nmsworks.week2.collection;
/*
Write a Java program to update an array element by the given element.
 */

import java.util.ArrayList;
import java.util.List;

public class Pq5 {
    List<String> subjects2 = new ArrayList<String>();

    public void setSubjects2() {
        subjects2.add("Tamil");
        subjects2.add("English");
        subjects2.add("Maths");
        subjects2.add("Science");
        subjects2.set(0,"social");
        System.out.println("This will show after list the subjects::" + subjects2);

    }
}
