package in.co.nmsworks.weekend;

import java.lang.reflect.Array;

public class Q21 {
    public void para(String s){
        String[] arr = s.split("//.");
        System.out.println(s);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);

        }

    }
}
