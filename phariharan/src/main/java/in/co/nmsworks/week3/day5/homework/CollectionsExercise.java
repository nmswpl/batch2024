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
 *
 * Given two `Set<String>` instances, write a method that returns a `Set<String>` containing the elements that are present in both sets (intersection).
 * **Challenge:** Consider edge cases where one or both sets are empty.
 *
 * Write a method that accepts a `List<List<Integer>>` and returns a flattened `List<Integer>` containing all the integers from the nested lists.
 * **Challenge:** Handle cases where the nested lists are of varying sizes.
 *
 * Write a method that processes a `Map<String, String>` and returns a new map where all null values are replaced with the string "Unknown".
 * **Challenge:** Ensure that the original map is not modified during processing.
 *
 * Write a method that takes a `List<String>` and returns a `Map<String, Integer>` where each key is a unique string from the list and the corresponding value is the number of occurrences of that string.
 * **Challenge:** Optimize the solution for performance.
 *
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
        listExample.addAll(Arrays.asList(new String[]{"Apple", "Mango", "Orange"}));
        exercise.reverseLinkedList(listExample);

        System.out.println();
        String[] students = {"Hari","suriya","vijay","ajith"};
        Map<String,Student> studentMap = new HashMap<>();
        for (int i = 0; i < students.length; i++) {
            studentMap.put(students[i],new Student(i,students[i]));
        }
        exercise.searchingInMap(studentMap,"Hari");
        exercise.insertIntoMap(studentMap,5,"Soori");
        exercise.deleteFromMap(studentMap,"soori");

        Set<String> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(new String[]{"Apple", "Mango", "Orange"}));
        Set<String > set2 = new HashSet<>();
        set2.addAll(Arrays.asList(new String[]{"Apple","Mango","Orange","Strawberry"}));
        System.out.println(exercise.setInsertion(set1,set2));

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(new Integer[]{1, 2, 3}));
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(new Integer[]{4,5,6}));
        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(new Integer[]{7,8,9}));
        List<List<Integer>> listOfList = new ArrayList<>();
        listOfList.add(list2);
        listOfList.add(list1);
        listOfList.add(list3);
        exercise.generateListFromListOfList(listOfList);

        System.out.println();
        Map< String ,String > mapExample = new HashMap<>();
        String[] names = {"Hari","Ajith","Vijay"};
        for (String name : names) {
            mapExample.put(name,null);
        }
        mapExample.put("Suriya","Actor");
        System.out.println("Before Removal of null :: "+mapExample);
        System.out.println("After removal of null "+exercise.removeNull(mapExample));

        System.out.println();
        System.out.println(exercise.generateMapWithOccurence(listExample));

        System.out.println();
//        List<Person> personList = new ArrayList<>();
//        Integer[] ageArray ={21,32,45,54,21};
//        String[] nameArray = {"Hari","Suriya","Ajith","Vijay","Soori"};
//        for (int i = 0; i < ageArray.length; i++) {
//            personList.add(new Person(nameArray[i],ageArray[i]));
//        }
//        exercise.sortList(personList);
    }


    private Map<String,Integer> generateMapWithOccurence(LinkedList<String> listExample) {
        Map<String,Integer> occurenceMap = new HashMap<>();
        for (String string : listExample) {
            if(occurenceMap.containsKey(string))
            {
                occurenceMap.put(string,(occurenceMap.get(string)+1));
            }
            else {
                occurenceMap.put(string,1);
            }
        }
        return occurenceMap;
    }

    private Map<String, String> removeNull(Map<String, String> mapExample) {
        Map<String,String> replacedMap = new HashMap<>();
        for (String string : mapExample.keySet()) {
            if(mapExample.get(string) == null){
                replacedMap.put(string,"unkonown");
            }
            else {
                replacedMap.put(string,mapExample.get(string));
            }
        }
        return replacedMap;
    }

    private void generateListFromListOfList(List<List<Integer>> listOfList) {
        List<Integer> integerList = new ArrayList<>();
        for (List<Integer> list : listOfList) {
            for (Integer i : list) {
                integerList.add(i);
            }
        }
        System.out.println(integerList);
    }

    private Set<String> setInsertion(Set<String> set1, Set<String> set2) {
        if (set1.isEmpty()){
            return set1;
        }
        else if (set2.isEmpty()){
            return set2;
        }
        else {
            set1.retainAll(set2);
            return set1;
        }
    }

    private void deleteFromMap(Map<String, Student> studentMap, String search) {
        studentMap.remove(search);
        System.out.println("Deletion Completed !!!");
    }

    private void insertIntoMap(Map<String, Student> studentMap, int i, String search) {
        studentMap.put(search,new Student(i,search));
        System.out.println("Insertion completed !!!");
    }

    private void searchingInMap(Map<String, Student> studentMap, String search) {
        System.out.println(studentMap.get(search));
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