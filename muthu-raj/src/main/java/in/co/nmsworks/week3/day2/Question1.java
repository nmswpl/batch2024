package in.co.nmsworks.week3.day2;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;

/*
Write a Java program that writes the following lines to a file named output.txt:
	Line 1: Hello, World!
	Line 2: Java file handling.
	Line 3: BufferedReader and BufferedWriter.
 */
public class Question1 {
    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("/home/nms/output.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            String[] lines = {"Hello, World!","Java file handling.","BufferedReader and BufferedWriter."};
            for (String line : lines) {
                bw.write(line + "\n");
            }
            bw.close();
        }
        catch (Exception e){
            System.out.println("Something went wrong!");
            e.printStackTrace();
        }



    }
}
