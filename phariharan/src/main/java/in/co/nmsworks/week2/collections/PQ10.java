package in.co.nmsworks.week2.collections;

import java.util.ArrayList;

/**
 * Write a Java program to compare two array lists.
 */

public class PQ10 {
    public void compareTwoList(ArrayList arr1 ,ArrayList arr2){
        if(arr1.containsAll(arr2) && arr1.size()==arr2.size()){
            System.out.println("Both array list are same");
        }
        else{
            System.out.println("Both are different");
        }
    }
}
