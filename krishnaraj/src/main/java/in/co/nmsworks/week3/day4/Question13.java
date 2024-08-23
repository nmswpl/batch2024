package in.co.nmsworks.week3.day4;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Question13 {
    public void wordCount(String path , String word){
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            int count = 0;
            while ((line = bufferedReader.readLine()) != null){
                String[] words =line.split(" ");
                for (String word1: words){
                    if(word1.contains(word)){
                        count ++;
                    }
                }
            }
            System.out.println("The word " + word + " occured " + count +" times");
            fileReader.close();
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void eachWordCount(String path){
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            Integer count;
            Map<String,Integer> wordToNumber = new HashMap<>();
            while ((line = bufferedReader.readLine()) != null){
                String[] words =line.split(" ");
                for (String word: words){
                    if(wordToNumber.containsKey(word)){
                        count =wordToNumber.get(word)+1;
                        wordToNumber.put(word,count);
                    }else {
                        wordToNumber.put(word,1);
                    }
                }
            }
            fileReader.close();
            bufferedReader.close();
            for(Map.Entry<String,Integer> entry: wordToNumber.entrySet()){
                System.out.println(entry.getKey() +" value occured : " + entry.getValue());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Question13 question13 = new Question13();
        String path ="/home/nms/Downloads/india.txt";
        question13.wordCount(path,"India");
        question13.eachWordCount(path);
    }
}
