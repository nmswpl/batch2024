package in.co.nmsworks.week3.day2;
/*
Write a Java program that reads a file named input.txt and counts the number of lines in the file.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program3 {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileReader fr = new FileReader("/home/nms/Downloads/input.txt");
        BufferedReader bufferedReader = new BufferedReader(fr);
        int count = 0;
        int i = 0;
        while((null != bufferedReader.readLine())) {
            count++;
        }
        System.out.println("the number of lines :: "+count);
        bufferedReader.close();
        fr.close();
    }
}

