package in.co.nmsworks.week3.day2;
/*
Write a Java program that reads a file named input.txt and searches for occurrences of the word "file".
Print out each line that contains the word "file".
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program6 {
    public void searchOccurrences() throws IOException {
        FileReader fr = new FileReader("/home/nms/input.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        int count =0;
        while ((line = br.readLine() )!= null){
            String[] words = line.split("file");
            count++;
            System.out.println(words);
        }
        System.out.println(count);
    }
}
