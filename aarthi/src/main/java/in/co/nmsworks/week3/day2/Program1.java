package in.co.nmsworks.week3.day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*Write a Java program that writes the following lines to a file named output.txt:
Line 1: Hello, World!
Line 2: Java file handling.
Line 3: BufferedReader and BufferedWriter.
*/
public class Program1 {
    public static void main(String[] args) throws IOException {
        String[] strArray = {"Hello, World!","Java file handling.","BufferedReader and BufferedWriter."};
        FileWriter fw = new FileWriter ("/home/nms/output.txt");
        BufferedWriter buffer = new BufferedWriter(fw);
        for (int i = 0; i < strArray.length; i++) {
            buffer.write(strArray[i]);
            buffer.newLine();

        }
        buffer.close();
        fw.close();

    }
}
