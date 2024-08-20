package in.co.nmsworks.week3.assessment.day2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Write a Java program that reads a text file named input.txt line by line and prints each line to the console.
 */

public class Program2 {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("/home/nms/input.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();

        while (line != null) {

            System.out.println(line);
            line = br.readLine();

        }
        br.close();
        fr.close();
    }
}