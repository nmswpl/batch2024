package in.co.nmsworks.week3.day2;
/*
Write a Java program that copies the content from a file named input.txt to a file named output.txt
 */

import java.io.*;

public class Program4 {
    public void copyContent() throws IOException {
        FileReader fr = new FileReader("/home/nms/input.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("/home/nms/output.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        String s=br.readLine(); ;
        while (s != null){
            bw.write(s);
            bw.newLine();
            s=br.readLine();

        }
        bw.close();
        fw.close();
        br.close();
    }
}
