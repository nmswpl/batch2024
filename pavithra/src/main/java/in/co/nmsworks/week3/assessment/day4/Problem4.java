package in.co.nmsworks.week3.assessment.day4;

/**
 * Implement the algorithm to find the min and max elements in an array of integers.
 */

public class Problem4 {
    public void findMinMax(int[] array) {
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Minimum number is : " + min);
        System.out.println("Maximum number is : " + max);

    }




}
