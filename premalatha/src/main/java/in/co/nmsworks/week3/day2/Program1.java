package in.co.nmsworks.week3.day2;
/*
Write a Java program that writes the following lines to a file named output.txt:
	Line 1: Hello, World!
	Line 2: Java file handling.
	Line 3: BufferedReader and BufferedWriter.
 */

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program1 {
    public void createFile() throws IOException {

        FileWriter fw = new FileWriter("/home/nms/output.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Hello, World!");
        bw.newLine();
        bw.write("Java file handling.");
        bw.newLine();
        bw.write("BufferedReader and BufferedWriter.");
        bw.close();
        fw.close();
    }
}
