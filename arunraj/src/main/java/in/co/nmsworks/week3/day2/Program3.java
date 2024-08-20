package in.co.nmsworks.week3.day2;

/*Write a Java program that reads a file named input.txt
and counts the number of lines in the file.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program3 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/home/nms/Downloads/input.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        int count = 0;
        while (line != null){
            count++;
            line = br.readLine();
        }
        System.out.println("No of lines : "+count);
        br.close();
        fr.close();
    }
}
