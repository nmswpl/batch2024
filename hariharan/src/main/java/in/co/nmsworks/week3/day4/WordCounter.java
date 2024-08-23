package in.co.nmsworks.week3.day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class WordCounter {
    public static void main(String[] args) {

        WordCounter wordCounter = new WordCounter();
        int wordCount = (wordCounter.specificWordCounter("/home/nms/Downloads/india.txt","india"));
        System.out.println("Word  occurred " + wordCount +" times");

        wordCounter.eachWordCounter("/home/nms/Downloads/india.txt");
    }

    public int specificWordCounter(String filePath, String word){
        int counter = 0;
        try(FileReader fileReader = new FileReader(filePath))
        {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                List<String> wordsList= new ArrayList<>();
                wordsList.addAll(Arrays.asList(line.replaceAll("\\.", "").replaceAll(",","").replaceAll("\\d","").replaceAll(":","").split(" ")));
                for (String string : wordsList) {
                    if(string.equalsIgnoreCase(word)){
                        counter++;
                    }
                }
                wordsList.clear();
            }
            bufferedReader.close();

        }catch(Exception e){
             e.printStackTrace();
        }

        return counter;
    }

    public void eachWordCounter(String filePath){
        try(FileReader fileReader = new FileReader(filePath)){
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            Map<String, Integer> wordCounter = new HashMap<String, Integer>();
            String line;
            while ((line = bufferedReader.readLine()) != null){
                List<String> wordsList= new ArrayList<>();
                wordsList.addAll(Arrays.asList(line.replaceAll("\\.", "").replaceAll(",","").replaceAll(":","").toLowerCase().split(" ")));
                for (String word : wordsList) {
                    if(wordCounter.containsKey(word)){
                        wordCounter.put(word,wordCounter.get(word)+1);
                    }else {
                        wordCounter.put(word,1);
                    }
                }
                wordsList.clear();
            }

            System.out.println(wordCounter);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
