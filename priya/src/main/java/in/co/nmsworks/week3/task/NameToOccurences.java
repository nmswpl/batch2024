package in.co.nmsworks.week3.task;

import java.util.*;

public class NameToOccurences {
    Map<String,Integer> namesToOccurences = new HashMap<>();
 public  Map<String,Integer> getUniqueNames(List<String> namelist) {
     Set<String> namesset = new HashSet<>(namelist);
     System.out.println(namesset);
     for (String name : namesset) {
         namesToOccurences.put(name, name.length());
     }
     return namesToOccurences;

 }
    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>();

        namesList.add("Priya");
        namesList.add("Mani");
        namesList.add("Priya");
        namesList.add("priya");
        namesList.add("Mani");
        namesList.add("Mani");
        namesList.add("Mani");
        namesList.add("Mani");
        NameToOccurences n = new NameToOccurences();
        System.out.println(n.getUniqueNames(namesList));
    }
}
