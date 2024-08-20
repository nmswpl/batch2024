package in.co.nmsworks.week3.day2;

import java.io.*;

/**
 * Write a Java program that reads a text file named input.txt line by line and prints each line to the console.
 */
public class Que02 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("/home/nms/Downloads/input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String string = bufferedReader.readLine();
        while (string != null) {
            System.out.println(string);
            string = bufferedReader.readLine();
        }
        bufferedReader.close();
        fileReader.close();
    }
}
