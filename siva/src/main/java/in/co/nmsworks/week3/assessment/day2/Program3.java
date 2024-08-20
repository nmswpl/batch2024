package in.co.nmsworks.week3.assessment.day2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Write a Java program that reads a file named input.txt and counts the number of lines in the file.
 */

public class Program3 {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("/home/nms/input.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        int count = 0;

        while (line != null){
            line = br.readLine();
            count++;
        }
        System.out.println("No of Lines in the File :: "+count+"Lines");
        br.close();
        fr.close();

    }
}
