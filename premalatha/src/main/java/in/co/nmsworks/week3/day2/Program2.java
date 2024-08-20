package in.co.nmsworks.week3.day2;

import java.io.*;

/*
Write a Java program that reads a text file named input.txt line by line and prints each line to the console.
 */
public class Program2 {
    public void readFile() throws IOException {
        FileReader fr = new FileReader("/home/nms/input.txt");
        BufferedReader br = new BufferedReader(fr);
        String s = "";
        while (s != null){
            s=br.readLine();
            System.out.println(s);
        }
        br.close();
        fr.close();
    }
}
