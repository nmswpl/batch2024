package in.co.nmsworks.week3.day2;

/*
Write a Java program that reads a file named input.txt and
searches for occurrences of the word "file". Print out each
line that contains the word "file".
 */

import java.io.*;

public class Program6 {
    public static void main(String[] args) throws IOException {
        FileReader fr =new FileReader("/home/nms/Downloads/input.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();

        while (line != null){
            if(line.contains("file")){
                System.out.println(line);
            }
            line = br.readLine();
        }
        br.close();
        fr.close();

    }
}
