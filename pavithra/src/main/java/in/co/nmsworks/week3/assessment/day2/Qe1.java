package in.co.nmsworks.week3.assessment.day2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Write a Java program that writes the following lines to a file named output.txt:
 * 	Line 1: Hello, World!
 * 	Line 2: Java file handling.
 * 	Line 3: BufferedReader and BufferedWriter.
 */

public class Qe1 {

    public static void main(String[] args) throws IOException {

        String[] arr ={"Hello, World","Java File Handling","BufferReader and BufferWriter"};

        FileWriter fw = new FileWriter("/home/nms/output.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        for(String line : arr){
            System.out.println(line);
            bw.write(line);
            bw.newLine();

        }
        bw.close();
        fw.close();
    }


}
