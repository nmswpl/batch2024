package in.co.nmsworks.week2.collection;
/*
6. Write a Java program to remove the third element from an array list.
 */

import java.util.ArrayList;
import java.util.List;

public class Pq6 {
    List<String> subjects3 = new ArrayList<String>();

    public void setSubjects3() {
        subjects3.add("Tamil");
        subjects3.add("English");
        subjects3.add("Maths");
        subjects3.add("Science");
        subjects3.remove(2);
        System.out.println("This will show after list the subjects::" + subjects3);


    }
}
