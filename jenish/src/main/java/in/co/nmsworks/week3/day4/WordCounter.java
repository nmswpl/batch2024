package in.co.nmsworks.week3.day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class WordCounter {
    public void countFrequencyOfWord(String path, String word){

        try(FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line = bufferedReader.readLine();
            int wordCount = 0;

            while (line != null){
                String[] words = line.split("[\\s,.:]");
                for (String string : words) {
                    if(word.equalsIgnoreCase(string.trim())){
                        wordCount++;
                    }
                }
                line = bufferedReader.readLine();
            }
            System.out.println(word+" occurs "+wordCount+" times.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void countFrequencyOfWords(String path) {
        Map<String,Integer> wordsToFrequency = new HashMap<>();
        try (FileReader fileReader = new FileReader(path);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line = bufferedReader.readLine();
            while (line != null) {
                String[] words = line.split("[\\s,.:]");
                for (String word : words) {
                    if(!word.isEmpty()){
                        word = word.trim().toLowerCase();
                        if(wordsToFrequency.containsKey(word)){
                           int currValue = wordsToFrequency.get(word);
                           wordsToFrequency.put(word, currValue + 1);
                        }
                        else{
                            wordsToFrequency.put(word,1);
                        }
                    }
                }
                line = bufferedReader.readLine();
            }
            System.out.println(wordsToFrequency);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        WordCounter wc = new WordCounter();
        String word = "india";
        wc.countFrequencyOfWord("/home/nms/Downloads/india.txt", word);
        wc.countFrequencyOfWords("/home/nms/Downloads/india.txt");
    }
}