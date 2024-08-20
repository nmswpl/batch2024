package in.co.nmsworks.week3.assignment.Day2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Q1 {
    public static void main(String[] args) throws IOException
    {
        String arr[] = {"Hello, World!","Java file handling.","BufferedReader and BufferedWriter"};
        FileWriter fr = new FileWriter("/home/nms/Output.txt");
        BufferedWriter buffer = new BufferedWriter(fr);
        for (int i = 0; i < arr.length; i++) {
            buffer.write(arr[i]);
            buffer.newLine();
            System.out.println(arr[i]);
        }buffer.close();
    }
}