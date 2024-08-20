package in.co.nmsworks.week3.day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/*
Write a Java program that appends a new line of text to an existing file named input.txt.
The new line should be: "Appending new content."
 */
public class Question5 {
    public static void main(String[] args) {
        try {
//            Writer
            FileWriter fw = new FileWriter("/home/nms/input1.txt", true);

            String appendString = "Appending new content.";
            fw.append(appendString);
            fw.close();
        }
        catch (Exception e) {
            System.out.println("Something went wrong!");
            e.printStackTrace();
        }

    }
}
