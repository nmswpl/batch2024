package in.co.nmsworks.week2;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Write a program to print the position of given element in an array. If not present, print -1
 * E.g : Input : arr = {7, 15, 41}
 * Search Element : 41 Output : 2;
 * Search Element : 5 Output : -1
 */

public class TE4 {
    public void searchPosition(int[] arr,int element){
        int result = -1;
        for (int i = 0; i < arr.length -1  ; i++) {
            if (arr[i]== element){
                result = i;
            }
        }
        System.out.println("Element "+element+" found in Position "+ result);
    }
}
