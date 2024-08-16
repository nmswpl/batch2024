package in.co.nmsworks.week2.collections;

/**
 * Write a Java program to insert an element into the array list at the index position.
 */

public class PQ4 {
    public void addInAnyIndex(PQ1 obj,String newElement,Integer index){
        obj.colourList.add(index,newElement);
        System.out.println(obj.colourList);
    }
}
