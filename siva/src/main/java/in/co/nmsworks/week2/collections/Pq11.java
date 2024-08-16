package in.co.nmsworks.week2.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * 11. Write a Java program to join two array lists.
 */

public class Pq11 {

    public void joinTwoList(){
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
