package in.co.nmsworks.week3.day4;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class Question10 {
    int key=0;
    int value =0;
    public Question10(int[] integerArray) {

        Map<Integer,Integer > valueCount = new HashMap<>();
        for (int value : integerArray) {
            if(valueCount.containsKey(value)){
                valueCount.put(value, valueCount.get(value) + 1);
            }else{
                valueCount.put(value, 1);
            }
        }

      int maxValue = Collections.max(valueCount.values());
        for(Map.Entry<Integer,Integer> entry : valueCount.entrySet()){
            System.out.println(entry.getKey() + " has " + entry.getValue() + " occurences");
            if(entry.getValue() == maxValue){
                key = entry.getKey();
                value = entry.getValue();
            }
        }

        System.out.println(key + " has more occurnace with value of" + value);
    }
}
