package in.co.nmsworks.week3.day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
Write a Java program that reads a file named input.txt and searches for occurrences of the word "file".
Print out each line that contains the word "file".
 */
public class Question6 {
    public static void main(String[] args) {

        try {
//        Readers
            FileReader fr = new FileReader("/home/nms/input.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null) {
                if (line.contains("file")) {
                    System.out.println(line);
                }
                line = br.readLine();
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Something went wrong!");
            e.printStackTrace();
        }

    }
}
