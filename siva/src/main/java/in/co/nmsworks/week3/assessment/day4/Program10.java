package in.co.nmsworks.week3.assessment.day4;


import java.util.HashMap;
import java.util.Map;

/**
 * Problem-10: Write a program to find the mode (most frequent element) of an array.
 *         Count the Frequency:
 *             4 appears 1 time
 *             7 appears 3 times
 *             1 appears 2 times
 *             8 appears 1 time
 *         Identify the Most Frequent Element: 7 is the most frequent with 3 occurrences.
 *         Mode: The mode is 7.
 */

public class Program10 {
    public static void main(String[] args) {
        new Program10().frequentElementsInArray(4,7,7,7,1,1,8);
    }
    public void frequentElementsInArray(int... arr){
        Map<Integer,Integer> frequency=new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            int count=0;
            for (int j = 0; j <arr.length ; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            frequency.put(arr[i],count);
        }
        int max=Integer.MIN_VALUE,key=0;
        for (Map.Entry<Integer, Integer> value : frequency.entrySet()) {
            System.out.println(value.getKey()+" appears  "+value.getValue()+"  times");
            if(max<value.getValue()){
                max=value.getValue();
                key=value.getKey();
            }
        }
        System.out.println(key+" is the most frequent with "+max+" occurrences");

    }
   
    
}
