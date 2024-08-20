package in.co.nmsworks.week3.assessment.day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Write a Java program that reads a file named input.txt and counts the number of lines in the file.
 */

public class Qe3 {
    public static void main(String[] args) throws IOException {

        String file = "input.txt";
        FileReader fr = new FileReader("/home/nms/Downloads/input.txt");
        BufferedReader reader = new BufferedReader(fr);

        reader.readLine();
        int i = 0;
        int count = 0;

        while(reader.readLine() != null){

            i++;
            count++;


        }

        System.out.println("The count of input file : " + count);





    }
}
