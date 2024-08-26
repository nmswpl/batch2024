package in.co.nmsworks.week3.day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CountWords {

    public static void main(String... args) {
        String url = "/home/nms/countWords2.txt";
        String word = "India";
        wordCount(url, word);
        eachWordCount(url);
    }

    private static void wordCount(String url, String word) {
        try (FileReader fr = new FileReader(url);
             BufferedReader br = new BufferedReader(fr)) {
            String line = br.readLine();
            int totalCount = 0;
            while (line != null) {
                if (line.contains(word)) {
                    for (String s : line.split("[,.: ]")) {
                        if (s.equalsIgnoreCase(word)) {
                            totalCount++;
                        }
                    }
                }
                line = br.readLine();
            }
            System.out.println("The total count of word " + "\"" + word + "\"" + " is " + totalCount);
        } catch (IOException e) {
            System.out.println("File not Found!");
            e.printStackTrace();
        }
    }


    private static void eachWordCount(String url) {
        try (FileReader fr = new FileReader(url);
             BufferedReader br = new BufferedReader(fr))
        {
            String line = br.readLine();
            Map<String, Integer> allWordCounter = new HashMap<>();
            while (line != null) {
                for (String word : line.split("[,.: ]")) {
                    if (!word.isEmpty()) {
                        if (!allWordCounter.containsKey(word)) {
                            allWordCounter.put(word, 1);
                        } else {
                            int count = allWordCounter.get(word);
                            allWordCounter.put(word, ++count);
                        }
                    }
                }
                line = br.readLine();
            }

            int totalWords = 0;
            for (String word : allWordCounter.keySet()) {
                System.out.println(word + ":: " + allWordCounter.get(word));
                totalWords += allWordCounter.get(word);
            }
            System.out.println("Total words :: " + totalWords);

        }
        catch (IOException e) {
            System.out.println("File not Found!");
            e.printStackTrace();
        }
    }
}

