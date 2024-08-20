package in.co.nmsworks.week3.day2;
/*
Write a Java program that appends a new line of text to an existing file named input.txt.
The new line should be: "Appending new content."
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program5 {
    public void appendLine() throws IOException {
        FileWriter fw = new FileWriter("/home/nms/input.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.append("Appending new content");
        bw.close();
        fw.close();
    }
}
