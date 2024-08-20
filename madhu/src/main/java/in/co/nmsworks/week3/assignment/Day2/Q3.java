package in.co.nmsworks.week3.assignment.Day2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* Write a Java program that reads a file named input.txt and counts the number of lines in the file.*/
public class Q3 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/home/nms/input.txt");
        BufferedReader buffer = new BufferedReader(fr);
        int count = 0;
        String str;
        while((str = buffer.readLine()) != null){
            System.out.println(str);
            count++;

        }
        System.out.println(count);
        buffer.close();
        fr.close();

    }
}
