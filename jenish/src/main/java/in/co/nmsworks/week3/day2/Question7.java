package in.co.nmsworks.week3.day2;

import java.io.*;

public class Question7 {
    public void changeWordOccurences() throws IOException {

        FileReader reader = new FileReader("/home/nms/old.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

        FileWriter writer = new FileWriter("/home/nms/modified.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        String line = bufferedReader.readLine();
        while(line != null){
            String newLine = line.replaceAll("old","new");
            bufferedWriter.write(newLine);
            line = bufferedReader.readLine();
        }

        bufferedWriter.close();
        writer.close();

        bufferedReader.close();
        reader.close();
    }

    public static void main(String[] args) throws IOException {
        Question7 q7 = new Question7();
        q7.changeWordOccurences();
    }
}