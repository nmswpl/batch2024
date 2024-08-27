package in.co.nmsworks.week3.Day4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Q10 {
    public void getMode(int... arr) {
        int mode = 0;
        int largestValue =0; int largestKey = 0;
        Map<Integer, Integer> elementTofrequency = new HashMap<>();
        for (int i = 0; i < arr.length ; i++) {
            elementTofrequency.put(arr[i], 0);
        }
        System.out.println(elementTofrequency);
            for(Integer key: elementTofrequency.keySet()){
                for (int i = 0; i <arr.length ; i++) {
                    if(key == arr[i]){
                           elementTofrequency.put(key,(elementTofrequency.get(key)+1));
                    }
                }
                System.out.println(key+ " occured "+ elementTofrequency.get(key)+" times");
            }
        for (Map.Entry<Integer, Integer> entry : elementTofrequency.entrySet()) {

            int value = entry.getValue();
            int key = entry.getKey();
            if( value>largestValue){
                largestValue = value;
                largestKey= key;
            }

        }
        System.out.println("Mode is:"+ largestKey);

    }
}
