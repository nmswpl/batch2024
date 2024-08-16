package in.co.nmsworks.week2.collections;

/**
 * Write a Java program to insert an element into the array list at the first position.
 */

public class PQ3 {
    public void addInFirstIndex(PQ1 obj,String newElement){
        System.out.println("Before added"+obj.colourList);
        obj.colourList.add(0,newElement);
        System.out.println("After added"+obj.colourList);
    }
    public void setInFirstIndex(PQ1 obj,String newElement){
        System.out.println("Before set : "+obj.colourList);
        obj.colourList.set(0,newElement);
        System.out.println("After Set : "+obj.colourList);
    }
}
