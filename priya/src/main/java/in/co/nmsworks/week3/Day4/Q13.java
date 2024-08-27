package in.co.nmsworks.week3.Day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Q13 {
    List<String> listOfStrings = new ArrayList<>();
    Map<String,Integer> wordToOccurence = new HashMap<>();
    public void getOccurenceOfEachWord(String filepath) {
        try (FileReader fr = new FileReader(filepath);
             BufferedReader bf = new BufferedReader(fr)) {
            String line;
            String[] lines = {};
            int count =0;
            while ((line = bf.readLine()) != null) {
                lines = line.replaceAll(",", " ").replaceAll("\\."," ").split("\\s+");
                bf.readLine();
                listOfStrings.add(Arrays.toString(lines));
                for (String s : lines) {
                    if(wordToOccurence.containsKey(s)){
                        wordToOccurence.put(s,wordToOccurence.get(s)+1);
                    }
                    else {
                        wordToOccurence.put(s,1);
                    }
                }
            }
            for (String word : wordToOccurence.keySet()) {
                System.out.println(word+" "+wordToOccurence.get(word));
            }
        }


        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Q13 q13 = new Q13();
        q13.getOccurenceOfEachWord("/home/nms/India.txt");
    }
}
