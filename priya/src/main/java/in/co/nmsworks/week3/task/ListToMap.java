package in.co.nmsworks.week3.task;

import java.util.*;

public class ListToMap {

    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>();
        Map<String,Integer> namesToOccurences = new HashMap<>();
        namesList.add("Priya");
        namesList.add("Mani");
        namesList.add("Priya");
        namesList.add("priya");
        namesList.add("Mani");
        namesList.add("Mani");
        namesList.add("Mani");
        namesList.add("Mani");
        Set<String> namesset = new HashSet<>(namesList);
        System.out.println(namesset);
        int count=0;
        for (String name : namesset) {
            for (String name1 : namesList) {
                if (name.equals(name1)) {
                    count++;
                }

            }
            namesToOccurences.put(name, count);
            count=0;
        }
        System.out.println(namesToOccurences);
    }
}
