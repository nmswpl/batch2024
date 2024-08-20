package in.co.nmsworks.week3.assessment.day2;

import java.io.*;

/**
 * Write a Java program that copies the content from a file named input.txt to a file named output.txt
 */

public class Program4 {
    public static void main(String[] args) throws IOException {
        FileReader fr  = new FileReader("/home/nms/input.txt");
        BufferedReader br = new BufferedReader(fr);

        FileWriter fw = new FileWriter("/home/nms/output.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        String line = br.readLine();

        while(line != null){
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }

        br.close();
        fr.close();
        bw.close();
        fw.close();

    }
}
