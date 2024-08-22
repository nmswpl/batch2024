package in.co.nmsworks.week3.day4;
/*
Write a program to find the mode (most frequent element) of an array.

    For e.g : [4,7,7,7,1,1,8]
        Count the Frequency:
            4 appears 1 time
            7 appears 3 times
            1 appears 2 times
            8 appears 1 time
        Identify the Most Frequent Element: 7 is the most frequent with 3 occurrences.
        Mode: The mode is 7.
 */

public class Q11 {
    public void toFindMode(int... arr) {
        int maxCount = 0;
        int mode = arr[0];

        System.out.println("Count the Frequency:");

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            System.out.println(arr[i] + " appears " + count + " times");
            if (count > maxCount) {
                maxCount = count;
                mode = arr[i];
            }
        }
        System.out.println("Mode: The mode is " + mode);
    }
}
