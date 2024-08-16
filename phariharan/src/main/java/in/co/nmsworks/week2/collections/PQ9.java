package in.co.nmsworks.week2.collections;

/**
 * Write a Java program to print reverse elements in an array list.
 */

public class PQ9 {
    public void reversePrint(PQ1 obj){
        for (int i = obj.colourList.size()-1; i < 0 ; i++) {
            System.out.println(obj.colourList.get(i));
        }
    }
}
