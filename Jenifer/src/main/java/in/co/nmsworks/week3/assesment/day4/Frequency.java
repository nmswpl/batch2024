package in.co.nmsworks.week3.assesment.day4;
/* Write a program to find the mode (most frequent element) of an array.
        Count the Frequency:
            4 appears 1 time
            7 appears 3 times
            1 appears 2 times
            8 appears 1 time
        Identify the Most Frequent Element: 7 is the most frequent with 3 occurrences.
        Mode: The mode is 7.
 */

public class Frequency {
    public void findFrequency() {
        int[] arr = {4, 7, 7, 7, 1, 1, 8};

        int currentElement = arr[0];
        int count = 0;
        for (int num : arr) {
            if (num == currentElement) {
                count++;
            } else {
                System.out.println(currentElement + " appears " + count + " times");
                currentElement = num;
                count = 1;
            }
        }
        System.out.println(currentElement + " appears " + count + " times");
    }
}
