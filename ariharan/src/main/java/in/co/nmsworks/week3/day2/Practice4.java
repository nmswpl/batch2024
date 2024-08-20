package in.co.nmsworks.week3.day2;
//Write a Java program that copies the content from a file named input.txt to a file named output.txt

import java.io.*;

public class Practice4 {
    public void copiesFileContent() throws IOException {
        FileReader freader =new FileReader("/home/nms/input.txt");
        BufferedReader bufferedReader=new BufferedReader(freader);
        FileWriter fwriter=new FileWriter("/home/nms/output.txt");
        BufferedWriter bufferedWriter=new BufferedWriter(fwriter);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
           System.out.println(line);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
        freader.close();
        fwriter.close();

        System.out.println("successfully copied");
    }

}
