package in.co.nmsworks.week3.day2;

import java.io.*;

/**
 * Write a Java program that reads a text file named input.txt line by line and prints each line to the console.
 */
public class Que02 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/home/nms/Downloads/input.txt");
        BufferedReader br = new BufferedReader(fr);
        String string = br.readLine();
        while (string != null) {
            System.out.println(string);
            string = br.readLine();
        }
        br.close();
        fr.close();
    }
}
