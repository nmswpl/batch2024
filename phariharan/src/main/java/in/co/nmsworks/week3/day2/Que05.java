package in.co.nmsworks.week3.day2;

import java.io.*;

/**
 * Write a Java program that appends a new line of text to an existing file named input.txt.
 * The new line should be: "Appending new content."
 */

public class Que05 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("/home/nms/Downloads/input.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.append("Appending new content.");
        bw.close();
        fw.close();
    }
}
