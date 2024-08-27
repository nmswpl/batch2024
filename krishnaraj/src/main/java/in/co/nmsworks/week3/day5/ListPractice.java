package in.co.nmsworks.week3.day5;

import java.util.*;

public class ListPractice {
    private Map<String, Integer> namesToAges;

    /****** Write a method that takes a `List<Integer>` and returns a new list with the even numbers removed and
     * the remaining numbers sorted in ascending order.  Challenge:** Implement this method using only Java’s `List` interface
     * methods and `Collections` utility class. ***/
    public void listRemoveEvenNumber(){
        List<Integer> listOfInteger = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> oddIntegerList = new ArrayList<>();
        for (Integer i : listOfInteger) {
            if (i % 2 != 0){
                oddIntegerList.add(i);
            }
        }
        System.out.println(oddIntegerList);
    }
    /****** Given two `Set<String>` instances, write a method that returns a `Set<String>`
     * containing the elements that are present in both sets (intersection).
     **Challenge:** Consider edge cases where one or both sets are empty. **/
    public void combineTwoSets() {
        Set<String> strings1 = (Set<String>) Arrays.asList("anbu", "raj", "krish");
        Set<String> strings2 = (Set<String>) Arrays.asList("anbu", "hari", "arun");
        Set<String> combinedSet = new HashSet<>(strings1);
        combinedSet.retainAll(strings2);
        System.out.println(combinedSet);
    }
/***** Write a method that takes a `Map<String, Integer>` where the keys are names and the values are
 *  ages. The method should return a new map with names as keys and the number of letters in each name as values.
 **Challenge:** Ensure that the implementation handles empty maps and provides accurate results. ****/
public void mapChanging(){
    Map<String ,Integer> namesToAges = new HashMap<>();
    namesToAges.put("krish",23);
    Map<String,Integer> namesToLength = new HashMap<>();
    for (String names : namesToAges.keySet()){
        namesToLength.put(names,names.length());
    }
}
/*****Write a method that takes a `List<String>` and returns a `Map<String, Integer>`
 * where each key is a unique string from the list and the corresponding value is the number of occurrences of that string.
 **Challenge:** Optimize the solution for performance.  **/

public void occurenceUsingMap(){
    List<String> stringList  = Arrays.asList("anbu","krish","raj","raj");
    Map<String,Integer> wordToOccurence = new HashMap<>();
    for (String string : stringList) {
        if(wordToOccurence.containsKey(string)){
            wordToOccurence.put(string,wordToOccurence.get(string)+1);
        }
        else {
            wordToOccurence.put(string,1);
        }
    }
}
/****
 * Write a method that processes a Map<String, String> and returns a new map where all null values are replaced with the string "Unknown".
 * *Challenge:* Ensure that the original map is not modified during processing.
 */
public Map<String, String> replaceNullValues(Map<String, String> originalMap) {
    Map<String, String> newMap = new HashMap<>();

    for (Map.Entry<String, String> entry : originalMap.entrySet()) {
        String key = entry.getKey();
        String value = (entry.getValue() == null) ? "Unknown" : entry.getValue();
        newMap.put(key, value);
    }

    return newMap;
}
/***
 *  Write a method that accepts a List<List<Integer>> and returns a flattened List<Integer> containing all the integers from the nested lists.
 * *Challenge:* Handle cases where the nested lists are of varying sizes.
 */
public List<Integer> finalList(List<List<Integer>> nestedList) {
    List<Integer> filealList = new ArrayList<>();

    for (List<Integer> subList : nestedList) {
        filealList.addAll(subList);
    }
    return filealList;
}
}
