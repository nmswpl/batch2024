package in.co.nmsworks.week3.day2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Write a Java program that reads a file named input.txt and
 * searches for occurrences of the word "file".
 * Print out each line that contains the word "file".
 */

public class Que06 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/home/nms/Downloads/input.txt");
        BufferedReader br = new BufferedReader(fr);
        String string = br.readLine();
        while (string != null) {
            if (string.contains("file")){
                System.out.println(string);
            }
            string = br.readLine();
        }
        br.close();
        fr.close();
    }
}
