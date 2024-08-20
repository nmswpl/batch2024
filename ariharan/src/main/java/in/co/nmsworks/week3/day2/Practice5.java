package in.co.nmsworks.week3.day2;
//Write a Java program that appends a new line of text
//        to an existing file named input.txt. The new line should be: "Appending new content."

import java.io.*;

public class Practice5 {
    public void appendingContentInFile() throws IOException {
        FileWriter fr=new FileWriter("/home/nms/input.txt",true);
        BufferedWriter br=new BufferedWriter(fr);
        br.append("Appending new content");
        br.newLine();

        System.out.println("successfully printed");
        br.close();
        fr.close();
        FileReader freader =new FileReader("/home/nms/input.txt");
        BufferedReader bufferedReader=new BufferedReader(freader);
        String lines;
        while ((lines=bufferedReader.readLine())!=null){
            System.out.println(lines);
        }

        bufferedReader.close();
        freader.close();
    }
}
