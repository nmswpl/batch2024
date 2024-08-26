package in.co.nmsworks.week3.assessment.day6;
import java.util.*;

public class PracticeQuestion10 {


        public static void main(String[] args) {

            List<String> namesList = Arrays.asList("Siva", "Arun", "Deepack", "Siva", "Krishna", "Deepack");

            Set<String> uniqueNames = new HashSet<>(namesList);

            Map<String, Integer> namesMap = new HashMap<>();

            for (String name : uniqueNames) {
                namesMap.put(name, name.length());
            }


            System.out.println("Names and their lengths:");
            for (Map.Entry<String, Integer> entry : namesMap.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Length: " + entry.getValue());
            }
        }
    }


