package in.co.nmsworks.week2;

import java.util.Arrays;

public class Training14 {
    public void reverse(String[] strs) {
        int j = 0;
        for (int i = strs.length - 1; i >= 0 ; i--) {
            strs[j] = strs[i];
            System.out.println(strs[j]);
            j++;
        }
    }
}