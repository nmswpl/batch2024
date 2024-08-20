package in.co.nmsworks.week3.day2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Write a Java program that writes the following lines to a file named output.txt:
 * 	Line 1: Hello, World!
 * 	Line 2: Java file handling.
 * 	Line 3: BufferedReader and BufferedWriter.
 */
public class Que01 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("/home/nms/Desktop/output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String[] stringArray = new String[]{"Hello, World!","Java file handling.","BufferedReader and BufferedWriter."};
        for (String value : stringArray) {
            bufferedWriter.write(value);
            bufferedWriter.newLine();
        }
        System.out.println("lines write in output.txt");
        bufferedWriter.close();
        fileWriter.close();
    }
}
