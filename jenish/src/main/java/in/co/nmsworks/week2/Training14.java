package in.co.nmsworks.week2;

import java.util.Arrays;

public class Training14 {
    public void reverse(String[] strs) {
        int left = 0;
        int right = strs.length - 1;

        while (left < right){
            String temp = strs[left];
            strs[left] = strs[right];
            strs[right] = temp;
            left ++;
            right--;
        }
        System.out.println("Reversed String : "+ Arrays.toString(strs));
    }
}