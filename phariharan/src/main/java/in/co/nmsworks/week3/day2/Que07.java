package in.co.nmsworks.week3.day2;

import java.io.*;

/**
 * Write a Java program that reads a file named original.txt,
 * replaces all occurrences of the word "old" with "new", and writes the modified content to a file named modified.txt.
 */

public class Que07 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("/home/nms/Downloads/original.txt");
        FileWriter fileWriter = new FileWriter("/home/nms/Downloads/modified.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String string = bufferedReader.readLine();
        while (string != null) {
            string = string.replaceAll("old","new");
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
