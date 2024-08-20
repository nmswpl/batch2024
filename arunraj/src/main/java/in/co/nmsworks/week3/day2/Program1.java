package in.co.nmsworks.week3.day2;

/*
Write a Java program that writes the following lines to a file named output.txt:
	Line 1: Hello, World!
	Line 2: Java file handling.
	Line 3: BufferedReader and BufferedWriter.
 */

import java.io.*;

public class Program1 {
    public static void main(String[] args) throws IOException {
        FileWriter fw =new FileWriter("/home/nms/Desktop/output.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        String[] line = {"Hello, World","Java file handling","BufferedReader and BufferedWriter"};

        for(String i : line){
            bw.write(i);
            bw.newLine();
        }
        bw.close();
        fw.close();
    }
}
