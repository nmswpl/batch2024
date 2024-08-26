package in.co.nmsworks.week3.day5;

/* Write a program that reads a list of names,
converts it to a `Set` to remove duplicates,
 and then stores the unique names in a `Map`
 where the key is the name and the value is
 the length of the name.
 */

import java.util.*;

public class DuplicateNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Messi","Ronaldo","Neymar","Messi","Neymar");
        Set<String> uniqueNames = new HashSet<>(names);
        Map<String,Integer> mapNames = new HashMap<>();

        for(String uniqeName : uniqueNames){
            mapNames.put(uniqeName,uniqeName.length());
        }
        for(Map.Entry<String,Integer> entry : mapNames.entrySet()){
            System.out.println(entry);
        }
    }
}
