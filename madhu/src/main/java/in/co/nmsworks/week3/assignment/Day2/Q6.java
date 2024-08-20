package in.co.nmsworks.week3.assignment.Day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* Write a Java program that reads a file named input.txt and searches for occurrences of the word "file".
Print out each line that contains the word "file".
 */
public class Q6 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/home/nms/input.txt");
        BufferedReader buffer = new BufferedReader(fr);
        String str = buffer.readLine();
        while (str != null) {
            if ((str.contains("file"))) {
                System.out.println(str);
            }
            str = buffer.readLine();
        }buffer.close();
        fr.close();
    }
}

