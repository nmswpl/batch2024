package in.co.nmsworks.week3.day4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
Write a program to count the number of words in a given file countWords.txt
 */
public class Problem6 {
    public void countNoOfWords() throws IOException {
        try {
            FileReader fr = new FileReader("/home/nms/countWords.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            int count = 0;
            while ((line = br.readLine()) != null) {
                br.readLine();
                String[] array = line.split(" ");
                for (int i = 0; i < array.length; i++) {
                        count++;
                }
            }
            System.out.println("Total number of words : " + count);
            br.close();
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

