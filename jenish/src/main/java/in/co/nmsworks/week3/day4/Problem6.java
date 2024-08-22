package in.co.nmsworks.week3.day4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Problem6 {
    public void countNoOfWords() throws IOException {
        FileReader fileReader = new FileReader("/home/nms/countWords.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int totalNoOfWords = 0;
        String line = bufferedReader.readLine();
        while(line != null){
            String[] words = line.split(" ");
            totalNoOfWords += words.length;
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        fileReader.close();
        System.out.println("Total number of words in a file "+totalNoOfWords);
    }
}