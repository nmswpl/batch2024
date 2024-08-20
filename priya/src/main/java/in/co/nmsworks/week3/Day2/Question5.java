package in.co.nmsworks.week3.Day2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Question5 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("/home/nms/input.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.append("26.Appending new Line");
        bw.close();
        fw.close();
        System.out.println("File append successfull");

    }
}
