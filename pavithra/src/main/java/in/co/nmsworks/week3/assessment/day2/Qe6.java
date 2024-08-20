package in.co.nmsworks.week3.assessment.day2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Write a Java program that reads a file named input.txt and searches for occurrences of the word "file".
 * Print out each line that contains the word "file".
 */

public class Qe6 {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("/home/nms/Downloads/input.txt");
        BufferedReader reader = new BufferedReader(fr);

        String line = reader.readLine();
        while(line != null){
            if(line.contains("file")){
                System.out.println(line);
        }
            line = reader.readLine();
    }
}
}
