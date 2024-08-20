package in.co.nmsworks.week3.day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;

/*
 Write a Java program that reads a text file named input.txt line by line and
  prints each line to the console.
 */
public class Question2 {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("/home/nms/input.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

            br.close();
        }
        catch (Exception e) {
            System.out.println("Something went wrong!");
            e.printStackTrace();
        }
    }
}
