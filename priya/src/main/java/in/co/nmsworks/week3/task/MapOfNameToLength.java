package in.co.nmsworks.week3.task;

import java.util.HashMap;
import java.util.Map;

public class MapOfNameToLength {
    public Map<String,Integer> nameToLength = new HashMap<>();
    public Map<String,Integer> getNameToLength(Map<String,Integer> map){
        if(map.isEmpty()){
            System.out.println("Map is empty!!");
        }
        for (String key : map.keySet()) {
            nameToLength.put(key,key.length());
        }
        return nameToLength;
    }

    public static void main(String[] args) {
        MapOfNameToLength mp = new MapOfNameToLength();
        Map<String,Integer> nameToAge = new HashMap<>();
        nameToAge.put("priya",22);
        nameToAge.put("mani",23);
        nameToAge.put("oviya",21);
        System.out.println(nameToAge);
        System.out.println(mp.getNameToLength(nameToAge));
    }
}
