package in.co.nmsworks.week3.day2;
//Write a Java program that writes the following lines to a file named output.txt:
//Line 1: Hello, World!
//Line 2: Java file handling.
//        Line 3: BufferedReader and BufferedWriter.

import java.io.*;

public class Practice1 {
    public void writeToTextFile() throws IOException {
        FileWriter fr=new FileWriter("/home/nms/output.txt");
        BufferedWriter br=new BufferedWriter(fr);
        String[] inputvalues={"Hello, World!","Java file handling","BufferedReader and BufferedWriter."};
        for (int i = 0; i <inputvalues.length; i++) {
            br.write(inputvalues[i]);
            br.newLine();
        }
        System.out.println("successfully Written");
        br.close();
        fr.close();

    }
}
