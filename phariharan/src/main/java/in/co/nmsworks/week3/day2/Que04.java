package in.co.nmsworks.week3.day2;

import java.io.*;

/**
 * Write a Java program that copies the content from a file named input.txt to a file named output.txt
 */

public class Que04 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/home/nms/Downloads/input.txt");
        FileWriter fw = new FileWriter("/home/nms/Downloads/output.txt");
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);
        String string = br.readLine();
        while (string != null) {
            bw.write(string);
            bw.newLine();
            string = br.readLine();
        }
        bw.close();
        br.close();
        fr.close();
    }
}
