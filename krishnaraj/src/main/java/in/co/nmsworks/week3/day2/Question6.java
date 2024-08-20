package in.co.nmsworks.week3.day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Write a Java program that reads a file named input.txt and searches for occurrences of the word "file".
 * Print out each line that contains the word "file".
 */
public class Question6 {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("/home/nms/Downloads/input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = bufferedReader.readLine();
        while (line != null) {
            if (line.contains("file")) {
                System.out.println(line);
            }
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        fileReader.close();
    }
}
