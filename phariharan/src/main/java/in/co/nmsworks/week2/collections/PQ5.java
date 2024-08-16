package in.co.nmsworks.week2.collections;

import java.util.LinkedList;
import java.util.List;

/**
 * Write a Java program to update an array element by the given element.
 */

public class PQ5 {
    public void replaceELement(PQ1 obj,String oldElement,String newElement){
        obj.colourList.set(obj.colourList.indexOf(oldElement),newElement);
        System.out.println(obj.colourList);
    }
}
