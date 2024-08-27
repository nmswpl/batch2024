package in.co.nmsworks.week3.assesment.weekend1;
/* Write a method that takes a `Map<String, Integer>` where the keys are names and
the values are ages. The method should return a new map with names as keys and
the number of letters in each name as values.
 */

import java.util.HashMap;
import java.util.Map;

public class Question3 {
    public Map<String, Integer> namesToNoOfLetters(){
        Map<String, Integer> namesToAge = new HashMap<>();
        namesToAge.put("Jenifer", 21);
        namesToAge.put("Premalatha", 21);
        namesToAge.put("Poshika", 20);
        namesToAge.put("Kowshika", 20);

        Map<String, Integer> nameToLetters = new HashMap<>();
        for(Map.Entry<String, Integer> entry : namesToAge.entrySet())
        {
            String name = entry.getKey();
            nameToLetters.put(name, name.length());
        }
        return nameToLetters;
    }
}
