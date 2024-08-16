package in.co.nmsworks.week2.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * 8. Write a Java program to copy one array list into another.
 */

public class Pq8 {

    public void copyArrayList(){
        List<String> names=new ArrayList<>();
        names.add("Siva");
        names.add("Jenish");
        List<String> girlsNames=new ArrayList<>();
        girlsNames.add("Suja");
        girlsNames.add("Priya");
        names.addAll(girlsNames);
        System.out.println("Copied Array List ::"+names );


    }
}
