package in.co.nmsworks.week3.day2;

import java.io.*;

public class Question1 {
    public static void main(String[] args) throws IOException {


       String[] strings = {"Hello, World!","ava file handling.","BufferedReader and BufferedWriter."};
        FileWriter fileWriter = new FileWriter("output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for(String line : strings){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

         bufferedWriter.close();
        fileWriter.close();



    }

}
