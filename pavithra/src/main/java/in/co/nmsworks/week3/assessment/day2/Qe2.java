package in.co.nmsworks.week3.assessment.day2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Write a Java program that reads a text file named input.txt line by line and prints each line to the console.
 */

public class Qe2 {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("/home/nms/Downloads/input.txt");
        BufferedReader reader = new BufferedReader(fr);
        int i = 0;
        while (reader.readLine() != null) {
            System.out.println(reader.readLine());
            i++;

        }

        reader.close();
        fr.close();
    }
}
