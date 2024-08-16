package in.co.nmsworks.week2.collections;

import java.util.ArrayList;

/**
 * Write a Java program to join two array lists.
 **/

public class PQ11 {
    public void combineTwoList(ArrayList arr1 ,ArrayList arr2){
        arr1.addAll(arr2);
        System.out.println(arr1);
    }
}
