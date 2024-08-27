package in.co.nmsworks.week3.Day4;

import java.util.Arrays;

public class Q5 {

    public void getSecondLargest(int[] arr) {
        int len = arr.length;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Second largest:"+ arr[len-2]);
    }
}
