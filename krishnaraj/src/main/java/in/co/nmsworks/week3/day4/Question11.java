package in.co.nmsworks.week3.day4;

import in.co.nmsworks.week3.day1.Question1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/***Write a program to find the mode (most frequent element) of an array.

 For e.g : [4,7,7,7,1,1,8]
 Count the Frequency:
 4 appears 1 time
 7 appears 3 times
 1 appears 2 times
 8 appears 1 time
 Identify the Most Frequent Element: 7 is the most frequent with 3 occurrences.
 Mode: The mode is 7.  ***/
public class Question11 {
    public void mostFrequentElement(int[] intArray) {
        int[] intArrayFreq = new int[100];
        int value = 0;
        for (int i = 0; i < intArray.length; i++) {
            value = intArray[i];
            if (intArrayFreq[value] == 0) {
                intArrayFreq[value] = 1;
            }else {
                intArrayFreq[value] = intArrayFreq[value] + 1;
            }
        }
        for (int i= 0; i < intArrayFreq.length;i++){
            if (intArrayFreq[i] != 0){
                System.out.println("the number : " + i + " occered : "+intArrayFreq[i]);
            }
        }
    }

    public static void main(String[] args) {
        Question11 question11 = new Question11();
        int[] intArray = {1,2,3,4,2,3,2};
        question11.mostFrequentElement(intArray);
    }
}
