package in.co.nmsworks.week3.day2;

import java.io.*;

public class Question4 {
    public void copiesContent() throws IOException {
        FileReader reader = new FileReader("/home/nms/Downloads/input.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

        FileWriter writer = new FileWriter("/home/nms/output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        String line = bufferedReader.readLine();
        while(line != null){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            line = bufferedReader.readLine();
        }

        bufferedWriter.close();
        writer.close();

        bufferedReader.close();
        reader.close();
    }

    public static void main(String[] args) throws IOException {
        Question4 q4 = new Question4();
        q4.copiesContent();
    }
}