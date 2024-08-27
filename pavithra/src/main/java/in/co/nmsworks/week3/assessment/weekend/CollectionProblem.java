package in.co.nmsworks.week3.assessment.weekend;
/**
 * **Question-1:** Write a method that takes a `List<Integer>` and returns a new list with the
 * even numbers removed and the remaining numbers sorted in ascending order.
 * **Challenge:** Implement this method using only Java’s `List` interface methods and `Collections` utility class.
 ***Question-2:** Given two `Set<String>` instances, write a method that returns a `Set<String>`
 * containing the elements that are present in both sets (intersection).
 * **Challenge:** Consider edge cases where one or both sets are empty
 * **Question-3:** Write a method that takes a `Map<String, Integer>` where the keys are names and the values are ages.
 * The method should return a new map with names as keys and the number of letters in each name as values.
 * **Challenge:** Ensure that the implementation handles empty maps and provides accurate results.
 ***Question-6:** Write a method that takes a `List<String>` and returns a `Map<String, Integer>`
 * where each key is a unique string from the list and the corresponding value is the number of occurrences of that string.
 * **Challenge:** Optimize the solution for performance.
 ***Question-7:** Design and implement a class that manages a collection of `Student` objects where each student has a unique ID and a name.
 *  The class should support efficient searching, insertion, and deletion by student ID.
 * **Challenge:** Choose the appropriate data structure for efficient operations.
 * **Question-8:** Write a method that processes a `Map<String, String>` and returns a new map where
 * all null values are replaced with the string "Unknown".
 * **Challenge:** Ensure that the original map is not modified during processing.
 ***Question-9:** Write a method that accepts a `List<List<Integer>>` and returns a flattened `List<Integer>`
 * containing all the integers from the nested lists.
 * **Challenge:** Handle cases where the nested lists are of varying sizes.
 *
 */

import java.util.*;

public class CollectionProblem {

        public void removeEvenNumFromList(List<Integer> numberList) {
            List<Integer> oddList = new ArrayList<>();
            for (Integer number : numberList) {
                if (number % 2 != 0) {
                    oddList.add(number);
                }
            }
            Collections.sort(oddList);
            System.out.println("Odd Sorted List :: " + oddList);
        }
    public Set<String> intersection(Set<String> set1, Set<String> set2){
        if((!set1.isEmpty() && set2.isEmpty())){
            set1.retainAll(set2);
            return set1;
        }
        else{
            return new HashSet<>();
        }
    }

    public Map<String, Integer> mapOfNameAndAge(Map<String,Integer> nameAgeMap){
        Map<String,Integer> nameLengthMap = new HashMap<>();
        for(Map.Entry<String,Integer> entry : nameAgeMap.entrySet()){
            String name = entry.getKey();
            nameLengthMap.put(name,name.length());
        }
        System.out.println(nameAgeMap);
        System.out.println(nameLengthMap);
        return nameAgeMap;
    }

    public void listIntoMap(List<String> colors){
        Map<String,Integer> occurrences = new HashMap<>();
        for (String color : colors) {
            if(occurrences.containsKey(color)){
                int currentValue = occurrences.get(color);
                occurrences.put(color,currentValue+1);
            }
            else{
                occurrences.put(color,1);
            }
        }
        System.out.println(occurrences);
    }

    public void nullValues(){
        Map<String,String> removeNulls = new HashMap<>();
        Map<String,String> newMap = new HashMap<>();
        removeNulls.put("Pavi","M");
        removeNulls.put("Aarthi", null);
        removeNulls.put("Madhu","G");
        removeNulls.put("Priya",null);

        for (String name : removeNulls.keySet()) {
            if(removeNulls.get(name) == null){
                newMap.put(name,"Unknown");
            }
            else{
                newMap.put(name, removeNulls.get(name));
            }
        }
        System.out.println(newMap);
    }

    public void listElement() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(11, 13, 15, 17, 19, 21);


        List<List<Integer>> results = new ArrayList<>();
        results.add(list1);
        results.add(list2);
        System.out.println(results);

        List<Integer> nestedList = convert(results);
        System.out.println(nestedList);


    }

    private List<Integer> convert(List<List<Integer>> results) {

        List<Integer> listFinal = new ArrayList<>();

        for (List<Integer> i : results) {
            System.out.println(i);
            listFinal.addAll(i);
        }
        System.out.println(listFinal.size());
        return listFinal;

    }


    public static void main(String[] args) {
        CollectionProblem cp = new CollectionProblem();

        cp.removeEvenNumFromList(new ArrayList<>(Arrays.asList(2,65,78,98,45,68)));
        System.out.println(" ");
        System.out.println(cp.intersection(new HashSet<>(Arrays.asList("apple","banana","grapes","pineapple")),new HashSet<>(Arrays.asList("pineapple","plums","apple","orange"))));
        Map<String,Integer> nameAgeMap = new HashMap<>();
        nameAgeMap.put("aarthi",1);
        nameAgeMap.put("pavi",2);
        nameAgeMap.put("priya",3);
        nameAgeMap.put("madhu",4);
        cp.mapOfNameAndAge(nameAgeMap);
        System.out.println(" ");
        cp.listIntoMap(new ArrayList<>(Arrays.asList("Blue" ,"Yellow" , "Red" ,"Violet" , "Red", "Orange")));
        System.out.println(" ");
        cp.listElement();
        System.out.println(" ");
        cp.nullValues();

}
}
