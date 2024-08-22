package in.co.nmsworks.week3.day4;

/*Write a program to find the mode (most frequent element)
 of an array.

    For e.g : [4,7,7,7,1,1,8]
        Count the Frequency:
            4 appears 1 time
            7 appears 3 times
            1 appears 2 times
            8 appears 1 time
        Identify the Most Frequent Element: 7 is the
        most frequent with 3 occurrences.
        Mode: The mode is 7.

 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question10 {
    public static void main(String[] args) {
        Question10 q10 = new Question10();
        q10.findMostFreqEle(new ArrayList<>());

    }

    public void findMostFreqEle(List<Integer> array){
        Set<Integer> frequentElement = new HashSet<>(array);

    }
}
