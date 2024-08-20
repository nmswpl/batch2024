package in.co.nmsworks.week3.Day2;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*Write a Java program that writes the following lines to a file named output.txt:
	Line 1: Hello, World!
	Line 2: Java file handling.
	Line 3: BufferedReader and BufferedWriter.*/
public class Question1 {
    public static void main(String[] args) throws IOException {
        String[] arr = {" Hello, World!","Java file handling."," BufferedReader and BufferedWriter."};
        FileWriter fw = new FileWriter("/home/nms/output.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        for(String string: arr){
            bw.write(string);
            bw.newLine();
        }
        bw.close();
        fw.close();
        System.out.println("File written successfully");
    }
}
