package in.co.nmsworks.week3.day4;

import java.io.*;
import java.util.Arrays;

/**
 * Write a program to count the number of words in a given file countWords.txt.
 */

public class Training6 {
    public void wordCount(){
        try (Reader reader = new FileReader("/home/nms/Documents/countWords.txt");
             BufferedReader br = new BufferedReader(reader)){
            int wordCount = 0;
            String word = br.readLine();
            while ((word != null)){
                String[] wordArray = word.split(" ");
                System.out.println(Arrays.toString(wordArray));
                wordCount += wordArray.length;
                word= br.readLine();
            }
            System.out.println("Total number of words in given file is : "+wordCount);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
