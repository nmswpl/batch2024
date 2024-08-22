package in.co.nmsworks.week3.day4;

import java.util.HashMap;
import java.util.Map;

/*

Problem-10: Write a program to find the mode (most frequent element) of an array.

    For e.g : [4,7,7,7,1,1,8]
        Count the Frequency:
            4 appears 1 time
            7 appears 3 times
            1 appears 2 times
            8 appears 1 time
        Identify the Most Frequent Element: 7 is the most frequent with 3 occurrences.
        Mode: The mode is 7.
 */
public class Program10 {
    public static void main(String[] args) {
        int[] arr = {4, 7, 7, 7, 1, 1, 8};
        findMode(arr);
    }

    private static void findMode(int[] arr) {
        int mode = 0;
        int count;
        Map<Integer, Integer> numCount = new HashMap<>();
        for (int i : arr) {
            if (!numCount.containsKey(i)) {
                numCount.put(i, 1);
            } else {
                count = numCount.get(i);
                numCount.replace(i, count, count + 1);
            }
        }

        for (Integer key : numCount.keySet()) {
            if (numCount.get(key) > mode) {
                mode = key;
            }
        }
        System.out.println("The mode is " + mode);

        String result = 8 == 8 ? "Equals" : "Not Equals";
        System.out.println(result);

    }
}
