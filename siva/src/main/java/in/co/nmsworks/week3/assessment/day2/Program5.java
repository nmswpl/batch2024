package in.co.nmsworks.week3.assessment.day2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Write a Java program that appends a new line of text to an existing file named input.txt. The new line should be: "Appending new content."
 */

public class Program5 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("/home/nms/input.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.append("Appending the new line");

     bw.close();
     fw.close();
    }
}
