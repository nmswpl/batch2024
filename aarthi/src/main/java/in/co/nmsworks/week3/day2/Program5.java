package in.co.nmsworks.week3.day2;
/*
Write a Java program that appends a new line of text to an existing file named input.txt.
The new line should be: "Appending new content."
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program5 {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("/home/nms/Downloads/input.txt",true);
        BufferedWriter bufferedWriter = new BufferedWriter(fw);

        bufferedWriter.append("Appending new content");

        bufferedWriter.close();
        fw.close();
    }
}
