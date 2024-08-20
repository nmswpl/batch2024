package in.co.nmsworks.week3.assessment.day2;

import java.io.*;

/**
 * Write a Java program that copies the content from a file named input.txt to a file named output.txt
 */

public class Qe4 {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("/home/nms/Downloads/input.txt");
        BufferedReader reader = new BufferedReader(fr);

        FileWriter fw = new FileWriter("/home/nms/output.txt");
        BufferedWriter writer = new BufferedWriter(fw);

        String line;
        line = reader.readLine();
        while ((line != null)) {
            writer.write(line);
            writer.newLine();
            line = reader.readLine();


        }

        writer.close();
        fw.close();
        reader.close();
        fr.close();


    }
}
