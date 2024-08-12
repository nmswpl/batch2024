package in.co.nmsworks.week2;

import java.util.Arrays;

/**
 * Write a program to print the position of given element in an array. If not present, print -1
 * E.g : Input : arr = {7, 15, 41}
 * Search Element : 41 Output : 2;
 * Search Element : 5 Output : -1
 */
public class Te4 {
    int answer;
    public void serach(int charVal){
        int[] arr1={7,15,41};
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]==charVal){
                answer=i;
            }
            else{
                answer=-1;
            }
        }
        System.out.println("Search Element : "+charVal);
        System.out.println("Output : "+answer);
    }
}
