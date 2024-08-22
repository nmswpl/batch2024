package in.co.nmsworks.week2.collections;
//Write a Java program to sort a given array list.

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Collections;

public class PqSort {
    public void sortList(ArrayList<Integer> ids){
        Collections.sort(ids);
        System.out.println("After sorted the list"+ids);
    }
}
