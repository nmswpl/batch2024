package in.co.nmsworks.week2;
//Given an array of String, Write a Program to reverse the array and print.
//For E.g Input : arr[] = {a, b, c} Output : arr[] = {c, b, a}

import java.lang.reflect.Array;
import java.util.Arrays;

public class Te14 {
    public void revArr(String  arr[]){
        String  revarr[]=new String[arr.length];
        int k=0;
        for (int i = arr.length-1; i>-1; i--) {
            revarr[k]=arr[i];
            k++;
        }
        System.out.println(Arrays.toString(revarr));
    }
}
