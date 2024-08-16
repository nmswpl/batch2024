package in.co.nmsworks.week2.collections;

import java.util.ArrayList;

/**
 * Write a Java program to copy one array list into another.
 */

public class PQ8 {
    public ArrayList createCopy(PQ1 obj){
        return new ArrayList<>(obj.colourList);
    }
}
