package in.co.nmsworks.week3.assessment.day2;

import java.io.*;

/**
 * Write a Java program that appends a new line of text to an existing file named input.txt.
 * The new line should be: "Appending new content."
 */
public class Qe5 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("/home/nms/Downloads/input.txt",true);
        BufferedWriter writer = new BufferedWriter(fw);

        writer.append("Appending new content");

        writer.close();
        fw.close();

    }

}
