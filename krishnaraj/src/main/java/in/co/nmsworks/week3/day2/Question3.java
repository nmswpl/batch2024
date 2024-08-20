package in.co.nmsworks.week3.day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Write a Java program that reads a file named input.txt and counts the number of lines in the file.
 */
public class Question3 {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("/home/nms/Downloads/input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = bufferedReader.readLine();
        int count = 0;
        while (line != null) {
            line = bufferedReader.readLine();
            count++;
        }
        System.out.println("The number of lines : " + count);
    }
}
