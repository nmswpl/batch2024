package in.co.nmsworks.week3.day2;

import java.io.*;

/**
 * Write a Java program that copies the content from a file named input.txt to a file named output.txt
 */

public class Que04 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("/home/nms/Downloads/input.txt");
        FileWriter fileWriter = new FileWriter("/home/nms/Downloads/output.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String string = bufferedReader.readLine();
        while (string != null) {
            bufferedWriter.write(string);
            bufferedWriter.newLine();
            string = bufferedReader.readLine();
        }
        bufferedWriter.close();
        bufferedReader.close();
        fileReader.close();
        fileWriter.close();
    }
}
