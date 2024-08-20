package in.co.nmsworks.week3.assessment.day2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Write a Java program that writes the following lines to a file named output.txt:
 * 	Line 1: Hello, World!
 * 	Line 2: Java file handling.
 * 	Line 3: BufferedReader and BufferedWriter.
 */

public class Program1 {

    public static void main(String[] args) throws IOException {

        String[] line = new String[]{"Hello , World!","Java file handling.","BufferedReader and BufferedWriter"};
        FileWriter fw = new FileWriter("/home/nms/output.txt");
        BufferedWriter bw= new BufferedWriter(fw);

        for (String s : line) {
            bw.write(s);
            bw.newLine();

        }
        bw.close();
        fw.close();

    }
}
