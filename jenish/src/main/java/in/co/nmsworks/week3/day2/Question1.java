package in.co.nmsworks.week3.day2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Question1 {
    public void writeAFile() throws IOException {
        FileWriter fw = new FileWriter("/home/nms/output.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        String[] arr = {"Hello, World!", "Java file handling", "Buffered reader and Buffered writer"};

        for (String string : arr) {
            bw.write(string);
            bw.newLine();
        }
        bw.close();
        fw.close();
    }

    public static void main(String[] args) throws IOException {
        Question1 q1 = new Question1();
        q1.writeAFile();
    }
}