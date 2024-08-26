package in.co.nmsworks.week3.task;

import java.util.HashMap;
import java.util.Map;

public class NullToUnknown {

    Map<String,String> optimizedMap = new HashMap<>();

    public Map<String,String> getOptimizedMap(Map<String,String> map){

        for (Map.Entry<String, String> entry : map.entrySet()) {
            if(entry.getValue()!=null){
                optimizedMap.put(entry.getKey(),entry.getValue());
            }
            else {
                optimizedMap.put(entry.getKey(), "Unknown");
            }
        }
        return  optimizedMap;

    }
    public static void main(String[] args) {
        Map<String,String> nullMap = new HashMap<>();
        nullMap.put("Priya",null);
        nullMap.put("Preetha",null);
        nullMap.put("Prema",null);
        nullMap.put("Pooja",null);
        nullMap.put("Geetha","Singer");
        nullMap.put("Kavi","Dancer");
        NullToUnknown n = new NullToUnknown();
        System.out.println(n.getOptimizedMap(nullMap));


    }


}
