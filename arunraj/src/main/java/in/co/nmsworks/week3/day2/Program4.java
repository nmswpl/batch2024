package in.co.nmsworks.week3.day2;

/*
Write a Java program that copies the content from a
file named input.txt to a file named output.txt
 */

import java.io.*;

public class Program4 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/home/nms/Downloads/input.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("/home/nms/Desktop/output.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        String line = br.readLine();
        while (line != null){
            bw.write(line);
            line = br.readLine();
            bw.newLine();
        }
        bw.close();
        fw.close();
        br.close();
        fr.close();
    }
}
