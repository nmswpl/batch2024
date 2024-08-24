package in.co.nmsworks.week3.homework;

import java.util.*;

public class CollectionsProblems {
    public void removeEvenNumFromList(List<Integer> numbersList){
        List<Integer> oddSortedList = new ArrayList<>();
        for (Integer number : numbersList) {
            if(number % 2 != 0){
                oddSortedList.add(number);
            }
        }
        Collections.sort(oddSortedList);
        System.out.println("Odd Sorted List :: "+oddSortedList);
    }

    public Set<String> mergeSetOfStrings(Set<String> set1, Set<String> set2){
        if(!(set1.isEmpty() && set2.isEmpty())){
                set1.retainAll(set2);
                return set1;
        }
        else{
            return new HashSet<>();
        }
    }

    public void setValuesIntoMap(Map<String, Integer> namesToAgeMap){
        Map<String,Integer> namesToCountOfLettersMap = new HashMap<>();
        namesToAgeMap.put("Jeff",22);
        namesToAgeMap.put("Sam",21);
        namesToAgeMap.put("John", 22);
        namesToAgeMap.put("Kyle", 24);

        for (String name : namesToAgeMap.keySet()) {
            String name1 = name;
            int countOfLetters = name.length();
            namesToCountOfLettersMap.put(name1,countOfLetters);
        }
        System.out.println(namesToCountOfLettersMap);
    }

    public void reverseLinkedList(){
        List<String> flowersList = new LinkedList<>();
        flowersList.add("rose");
        flowersList.add("jasmine");
        flowersList.add("sunflower");
        flowersList.add("lily");

        int size = flowersList.size();
        for (int i = 0; i < size / 2; i++) {
            String temp = flowersList.get(i);
            flowersList.set(i, flowersList.get(size - 1 - i));
            flowersList.set(size - 1 - i, temp);
        }
        System.out.println(flowersList);
    }

    public void listIntoMap(List<String> wordsList){
        Map<String,Integer> wordsToItsOccurrences = new HashMap<>();
        for (String word : wordsList) {
            if(wordsToItsOccurrences.containsKey(word)){
                int currValue = wordsToItsOccurrences.get(word);
                wordsToItsOccurrences.put(word,currValue+1);
            }
            else{
                wordsToItsOccurrences.put(word,1);
            }
        }
        System.out.println(wordsToItsOccurrences);
    }

    public void processTheMapWithNullValues(){
        Map<String,String> map = new HashMap<>();
        Map<String,String> newMap = new HashMap<>();
        map.put("A","apple");
        map.put("B", null);
        map.put("C","cat");
        map.put("D",null);

        for (String key : map.keySet()) {
            if(map.get(key) == null){
                newMap.put(key,"Unknown");
            }
            else{
                newMap.put(key, map.get(key));
            }
        }
        System.out.println(newMap);
    }

    public void flattenTheList() {
        List<List<Integer>> numbersList = new ArrayList<>(Arrays.asList(Arrays.asList(2, 3, 4, 5, 9, 10),Arrays.asList(6, 7, 8, 9, 12, 15, 16)));
        List<Integer> flattenedList = new ArrayList<>();

        for (List<Integer> numberList : numbersList) {
            for (Integer number : numberList) {
                flattenedList.add(number);
            }
        }
        System.out.println(flattenedList);
    }

    public static void main(String[] args) {
        CollectionsProblems cp = new CollectionsProblems();
        cp.removeEvenNumFromList(new ArrayList<>(Arrays.asList(1,2,6,3,7,11,4,8)));
        System.out.println(cp.mergeSetOfStrings(new HashSet<>(Arrays.asList("blue","yellow","white","green")),new HashSet<>(Arrays.asList("blue","yellow","black","red"))));
        cp.setValuesIntoMap(new HashMap<>());
        cp.reverseLinkedList();
        cp.listIntoMap(new ArrayList<>(Arrays.asList("rose","jasmine","sunflower","lily","lily","rose","rose")));
        cp.processTheMapWithNullValues();
        cp.flattenTheList();
    }
}