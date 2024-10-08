package in.co.nmsworks.week3.day2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/***
 * Write a Java program that writes the following lines to a file named output.txt:
 * 	Line 1: Hello, World!
 * 	Line 2: Java file handling.
 * 	Line 3: BufferedReader and BufferedWriter
 */
public class Question1 {

    public static void main(String[] args) throws IOException {

        String[] stringArray = new String[]{"Hello, World!", " Java file handling.", "BufferedReader and BufferedWriter"};

        FileWriter fileWriter = new FileWriter("/home/nms/output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (String string : stringArray) {
            bufferedWriter.write(string);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        fileWriter.close();
    }
}

