package in.co.nmsworks.week3.day4;

import java.util.HashMap;
import java.util.Map;

public class Problem10 {
    public void findFrequencyOfElement(int[] numbers) {
        Map<Integer, Integer> frequencyOfElement = new HashMap<>();

        for (int number : numbers) {
            if (frequencyOfElement.containsKey(number)) {
                int newCount = frequencyOfElement.get(number) + 1;
                frequencyOfElement.put(number, newCount);
            } else {
                frequencyOfElement.put(number, 1);
            }
        }

        int modeOfMost = 0;
        int occurences = 0;

        for (Integer mode : frequencyOfElement.keySet()) {
            System.out.println(mode + " appears " + frequencyOfElement.get(mode) + " times");
            if (frequencyOfElement.get(mode) > modeOfMost) {
                modeOfMost = mode;
                occurences = frequencyOfElement.get(mode);

            }
        }
        System.out.println("Mode :: " + modeOfMost);
        System.out.println("Occurrences :: " + occurences);
    }
}