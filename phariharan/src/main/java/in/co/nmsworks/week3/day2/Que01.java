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
        FileWriter fw = new FileWriter("/home/nms/output.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        String[] stringArray = new String[]{"Hello, World!","Java file handling.","BufferedReader and BufferedWriter."};
        for (String value : stringArray) {
            bw.write(value);
            bw.newLine();
        }
        System.out.println("lines write in output.txt");
        bw.close();
        fw.close();
    }
}
