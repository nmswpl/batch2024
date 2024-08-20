package in.co.nmsworks.week3.day2;
/*
Write a Java program that reads a text file named input.txt line by line and prints each line to the console.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileReader fr = new FileReader("/home/nms/Downloads/input.txt");
        BufferedReader bufferedReader = new BufferedReader(fr);
        int i=0;
        while((null != bufferedReader.readLine()))
        {
            System.out.println(bufferedReader.readLine());
            i++;
        }

        bufferedReader.close();
        fr.close();
    }
}