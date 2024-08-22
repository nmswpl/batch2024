package in.co.nmsworks.week3.day4;
/*
Implement the algorithm to find the min and max elements in an array of integers.
 */

public class Q5 {

    public void findMinMax(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The minimum element:: "+min);
        System.out.println("The maximum element:: "+max);
    }
}












