package in.co.nmsworks.week3.assesment.weekend1;
/* Write a method that takes a `List<String>` and returns a `Map<String, Integer>` where each key is a unique
string from the list and the corresponding value is the number of occurrences of that string.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question6 {
    public Map<String, Integer> occurrence(){
        Map<String, Integer> stringToOccurrence = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("M");
        list.add("J");
        list.add("J");

        for (String string : list) {
            stringToOccurrence.put(string, stringToOccurrence.getOrDefault(string, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : stringToOccurrence.entrySet()){
            String str = entry.getKey();
            Integer occ = entry.getValue();
        }
        return stringToOccurrence;
    }
}
