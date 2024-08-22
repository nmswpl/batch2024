package in.co.nmsworks.week3.day4;
/*
Write a program to find the second largest number in an array.
 */

public class Problem5 {
    public void secondLargestElement() {
        int[] array = {20, 15, 16, 67, 12};
        int max = 0;
        int secondmax = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > max) {
                    secondmax = max;
                    max = array[i];
                } else if (array[i] > secondmax && array[i] < max) {
                    secondmax = array[i];
                }
            }
            System.out.println("Second largest element = " + secondmax);
        }
    }
}

