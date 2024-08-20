package in.co.nmsworks.week3.day2;

import java.io.BufferedReader;
import java.io.FileReader;

/*
Write a Java program that reads a file named input.txt and counts the number of lines in the file.
 */
public class Question3 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("/home/nms/input.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();
            int lineCount = 0;
            while (line != null) {
                lineCount += 1;
                line = br.readLine();
            }

            System.out.println("No.Of lines in input.txt are :: " + lineCount);

            br.close();
        } catch (Exception e) {
            System.out.println("Something went wrong!");
            e.printStackTrace();
        }
    }
}
