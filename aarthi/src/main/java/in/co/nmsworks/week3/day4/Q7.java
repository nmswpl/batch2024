package in.co.nmsworks.week3.day4;
/*
Write a program to count the number of words in a given file
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Q7 {
    public void countNumWords() {
        try (FileReader fr = new FileReader("/home/nms/countWords.txt");
             BufferedReader reader = new BufferedReader(fr)){
            int count = 0;
            String line = reader.readLine();
            while (line != null) {
                String[] wordarr = line.split(" ");
                count += wordarr.length;
                line = reader.readLine();

            }System.out.println("The count of words:: "+count);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
