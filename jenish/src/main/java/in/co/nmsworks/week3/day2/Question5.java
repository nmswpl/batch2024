package in.co.nmsworks.week3.day2;

import java.io.*;

public class Question5 {
    public void addNewLine() throws IOException {
        FileWriter writer = new FileWriter("/home/nms/Downloads/input.txt",true);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.append("Appending new content");

        bufferedWriter.close();
        writer.close();
    }

    public static void main(String[] args) throws IOException {
        Question5 q5 = new Question5();
        q5.addNewLine();
    }
}