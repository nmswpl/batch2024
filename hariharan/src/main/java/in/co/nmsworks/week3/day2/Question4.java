package in.co.nmsworks.week3.day2;

import java.io.*;

public class Question4 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("/home/nms/Downloads/input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        FileWriter fileWriter = new FileWriter("output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


        String line;
        while ((line = bufferedReader.readLine()) != null){
            bufferedWriter.write(line);
            bufferedWriter.newLine();

        }

        bufferedWriter.close();
        fileWriter.close();

        fileReader.close();
        bufferedReader.close();

    }
}
