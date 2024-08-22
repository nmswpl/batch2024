package in.co.nmsworks.week3.day2;
/*
Write a Java program that copies the content from a file named input.txt to a file named output.txt
 */

import java.io.*;

public class Program4 {

    public static void main(String[] args)throws IOException {

        FileReader fr = new FileReader("/home/nms/Downloads/input.txt");
        BufferedReader bufferedReader = new BufferedReader(fr);

        FileWriter fw = new FileWriter("/home/nms/output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fw);

        String line = bufferedReader.readLine();

        while((null != line)) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            line = bufferedReader.readLine();
        }

        bufferedWriter.close();
        fw.close();
        bufferedReader.close();
        fr.close();
    }
}