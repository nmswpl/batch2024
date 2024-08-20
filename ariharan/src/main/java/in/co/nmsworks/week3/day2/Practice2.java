package in.co.nmsworks.week3.day2;
//Write a Java program that reads a text file named input.txt line by line and prints each line to the console.

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Practice2 {
    public void readTheTextFile() throws IOException {
        FileReader fr =new FileReader("/home/nms/input.txt");
        BufferedReader br=new BufferedReader(fr);
        String lines;
        while ((lines=br.readLine())!=null){
            System.out.println(lines);
        }
        System.out.println("successfully printed");
        br.close();
        fr.close();
    }

}
