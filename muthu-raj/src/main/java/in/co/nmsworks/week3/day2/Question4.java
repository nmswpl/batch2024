package in.co.nmsworks.week3.day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/*
Write a Java program that copies the content from a file named input.txt to a file named output.txt
 */
public class Question4 {
    public static void main(String[] args) {
        try {
//            Readers
            FileReader fr = new FileReader("/home/nms/input.txt");
            BufferedReader br = new BufferedReader(fr);

//            Writers
            FileWriter fw = new FileWriter("/home/nms/output1.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            String line = br.readLine();

            while (line != null) {
                bw.write(line+"\n");
                line = br.readLine();
            }

            System.out.println("input.txt has been copied to output1.txt successfully");

            br.close();
            bw.close();

        } catch (Exception e) {
            System.out.println("Something went wrong!");
            e.printStackTrace();
        }
    }
}
