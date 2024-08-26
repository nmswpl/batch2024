package in.co.nmsworks.week3.assessment.day7;
import java.util.HashMap;
import java.util.Map;

public class Question7 {



        public static Map<String, String> replaceNullValues(Map<String, String> originalMap) {

            Map<String, String> newMap = new HashMap<>();

            for (Map.Entry<String, String> entry : originalMap.entrySet()) {
                String value = entry.getValue() != null ? entry.getValue() : "Unknown";
                newMap.put(entry.getKey(), value);
            }

            return newMap;
        }

        public static void main(String[] args) {
            Map<String, String> originalMap = new HashMap<>();
                    originalMap.put("1", "Siva");
                    originalMap.put("2", null);
                    originalMap.put("3", null);
                    originalMap.put("4", "Deepack");


            Map<String, String> processedMap = replaceNullValues(originalMap);

            processedMap.forEach((key, value) -> System.out.println(key + ": " + value));
        }
    }


