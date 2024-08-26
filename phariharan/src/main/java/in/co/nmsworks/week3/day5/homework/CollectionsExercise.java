package in.co.nmsworks.week3.day5.homework;

import java.util.*;

/**
 * Write a method that takes a `List<Integer>` and
 * returns a new list with the even numbers removed and the remaining numbers sorted in ascending order.
 * **Challenge:** Implement this method using only Java’s `List` interface methods and `Collections` utility class.
 *
 * Write a method that takes a `Map<String, Integer>` where the keys are names and the values are ages. The method should return a new map with names as keys and the number of letters in each name as values.
 * **Challenge:** Ensure that the implementation handles empty maps and provides accurate results.
 *
 *  Write a method that reverses the elements of a `LinkedList<String>` without using additional collections. The method should modify the original list in place.
 * **Challenge:** Implement this method using only `LinkedList` methods.
 *
 * Write a method that accepts a `List<List<Integer>>` and returns a flattened `List<Integer>` containing all the integers from the nested lists.
 * **Challenge:** Handle cases where the nested lists are of varying sizes.
 */


public class CollectionsExercise {

    public static void main(String[] args) {
        CollectionsExercise exercise = new CollectionsExercise();
        Integer[] intArray = {6,3,1,7,4,9,9,2,0};
        List<Integer> integerList = new ArrayList<>(Arrays.asList(intArray));
        System.out.println(exercise.GenerateList(integerList));
        Map<String,Integer> nameToAgeMap = new HashMap<>();
        nameToAgeMap.put("Hari",22);
        nameToAgeMap.put("Suriya",45);
        nameToAgeMap.put("Vijay",47);
        System.out.println(exercise.getNameToCountMap(nameToAgeMap));
        LinkedList<String> listExample = new LinkedList<>();
        listExample.addAll(List.of(new String[]{"Apple", "Mango", "Orange"}));
        exercise.reverseLinkedList(listExample);



    }

    private void reverseLinkedList(LinkedList<String> listExample) {
        System.out.println(listExample);
        for (int i = 0; i < listExample.size()/2; i++) {
            String temp = listExample.get(i);
            listExample.set(i,listExample.get(listExample.size()-1-i));
            listExample.set(listExample.size()-1-i,temp);
        }
        System.out.println(listExample);
    }

    private Map<String,Integer> getNameToCountMap(Map<String, Integer> nameToAgeMap) {
        Map<String,Integer> nameToCountMap = new HashMap<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : nameToAgeMap.entrySet()) {
            nameToCountMap.put(stringIntegerEntry.getKey(),stringIntegerEntry.getKey().length());
        }
        return nameToCountMap;
    }

    private List<Integer> GenerateList(List<Integer> integerList) {
        List<Integer> sortedList = new ArrayList<>();
        for (Integer i : integerList) {
            if (i % 2 == 0) {
                sortedList.add(i);
            }
        }
        Collections.sort(sortedList);
        return sortedList;
    }
}
