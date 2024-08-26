package in.co.nmsworks.week3.assessment.day7;
import java.util.*;

public class Question6 {

        public static Map<String, Integer> countOccurrences(List<String> list) {
            Map<String, Integer> frequencyMap = new HashMap<>();

            for (String str : list) {
                frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
            }


            return frequencyMap;
        }

        public static void main(String[] args){
            List<String> strings = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple"));
            Map<String, Integer> result = countOccurrences(strings);

            result.forEach((key, value) -> System.out.println(key + ": " + value));
        }
    }


