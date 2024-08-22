package in.co.nmsworks.week3.day4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountSpecificWords {
    public static void countingWordsInFile(String path, String word) {
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            int count = 0;
            while ((line = br.readLine()) != null) {
                br.readLine();
                String[] array = line.split(" ");
                for (int i = 0; i < array.length; i++) {
                    if (array[i].equalsIgnoreCase(word)) {
                        count++;
                    }
                }
            }
            System.out.println("Total number of words : " + count);
            br.close();
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        CountSpecificWords countWords = new CountSpecificWords();
        CountSpecificWords.countingWordsInFile("/home/nms/india.txt", "country");
    }
}


