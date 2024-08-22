package in.co.nmsworks.week3.day4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Question6 {
    public Question6() {
        try {
            FileReader fileReader = new FileReader("/home/nms/countWords.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            int wordCount = 0;
            while((line = bufferedReader.readLine()) != null){
               String[] words = line.split(" ");

               wordCount += words.length;
            }

            System.out.println("Word Count"+wordCount);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
