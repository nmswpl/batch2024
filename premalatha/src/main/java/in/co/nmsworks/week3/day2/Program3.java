package in.co.nmsworks.week3.day2;
/*
Write a Java program that reads a file named input.txt and counts the number of lines in the file.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program3 {
    public void countLine() throws IOException {
        FileReader fr = new FileReader("/home/nms/input.txt");
        BufferedReader br = new BufferedReader(fr);
        int count =0;
        while(br.readLine()!=null){
            count++;
        }
        System.out.println(count);
        br.close();
        fr.close();
    }
}
