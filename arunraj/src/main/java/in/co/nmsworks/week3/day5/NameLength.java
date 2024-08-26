package in.co.nmsworks.week3.day5;

import java.util.HashMap;
import java.util.Map;

/***Question-3:** Write a method that takes a `
Map<String, Integer>` where the keys are names and
 the values are ages. The method should return a
 new map with names as keys and the number of
 letters in each name as values.
 **Challenge:** Ensure that the implementation
 * handles empty maps and provides accurate results.
 *  */

public class NameLength {
    public static void main(String[] args) {
        NameLength nm = new NameLength();
        nm.updateNameLength();
    }

    public void updateNameLength(){
        Map<String,Integer> nameAges = new HashMap<>();
        nameAges.put("Messi",36);
        nameAges.put("Ronaldo",40);
        nameAges.put("Neymar",32);
        nameAges.put("Mbappe",25);
        nameAges.put("Haaland",22);

        Map<String,Integer> nameLength = new HashMap<>();
        for (String name : nameAges.keySet()){
            nameLength.put(name,name.length());
        }

        for (Map.Entry<String,Integer> names : nameLength.entrySet()){
            System.out.println(names);
        }
    }
}
