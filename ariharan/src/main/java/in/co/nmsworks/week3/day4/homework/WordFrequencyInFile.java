package in.co.nmsworks.week3.day4.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyInFile {
    public static void main(String[] args) {
         new WordFrequencyInFile().frequencyCheckerInFile("/home/nms/India.txt","India");
//        new WordFrequencyInFile().wordFrequencyInFile("/home/nms/India.txt");
}
    public void frequencyCheckerInFile(String path,String string){
        try(FileReader fr =new FileReader(path);
            BufferedReader br=new BufferedReader(fr)){

            String line;
            int frequency=0;
            while((line=br.readLine())!=null){
                String words[]=line.split("[\\s,.:]");
                for (String word : words) {
                    word=word.trim();
                    if(word.equalsIgnoreCase(string))
                        frequency++;
                }
            }
            System.out.println(string+" occurs ::"+frequency+" times");
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public void wordFrequencyInFile(String path){
        Map<String,Integer> wordToCount=new HashMap<>();
        try(FileReader fr =new FileReader(path);
            BufferedReader br=new BufferedReader(fr)) {

            String line;
            int frequency = 0;
            while ((line = br.readLine()) != null) {
                String words[]=line.split("[\\s,.:]");
                for (String word : words) {
                    if(!word.isEmpty()) {
                        word = word.trim().toLowerCase();
                        if (wordToCount.containsKey(word)) {
                            frequency = (wordToCount.get(word)) + 1;
                            wordToCount.put(word, frequency);
                        } else {
                            frequency = 1;
                            wordToCount.put(word, frequency);
                        }
                    }
                }
            }
            for (Map.Entry<String, Integer> entry : wordToCount.entrySet()) {
                System.out.println(entry.getKey()+"   -occurs ::"+entry.getValue()+" times");
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
