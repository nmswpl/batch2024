package in.co.nmsworks.week3.day2;

import java.io.*;

/***Write a Java program that copies the content from a file named input.txt to a file named output.txt
 *
 */
public class Question4 {

    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("/home/nms/Downloads/input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        FileWriter fileWriter = new FileWriter("/home/nms/Downloads/output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        String line = bufferedReader.readLine();

        while (line != null) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            line = bufferedReader.readLine();
        }
        bufferedWriter.close();
        fileWriter.close();
        bufferedReader.close();
        fileReader.close();
    }
}
