package in.co.nmsworks.week3.day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Write a Java program that reads a file named input.txt and counts the number of lines in the file.
 */

public class Que03 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/home/nms/Downloads/input.txt");
        BufferedReader br = new BufferedReader(fr);

        int count = 0 ;
        while (br.readLine() != null) {
            count +=1;
        }
        System.out.println("No of lines in the input.txt is "+count);
    }
}
