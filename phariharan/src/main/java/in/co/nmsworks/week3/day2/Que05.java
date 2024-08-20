package in.co.nmsworks.week3.day2;

import java.io.*;

/**
 * Write a Java program that appends a new line of text to an existing file named input.txt.
 * The new line should be: "Appending new content."
 */

public class Que05 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("/home/nms/Downloads/input.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.append("Appending new content.");
        bufferedWriter.close();
        fileWriter.close();
    }
}
