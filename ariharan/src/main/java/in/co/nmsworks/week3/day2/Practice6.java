package in.co.nmsworks.week3.day2;

//Write a Java program that reads a file named input.txt and searches for
//occurrences of the word "file". Print out each line that contains the word "file".

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Practice6 {
    public void searchWordInFile() throws IOException {
        FileReader fr =new FileReader("/home/nms/input.txt");
        BufferedReader br=new BufferedReader(fr);
        String lines;
        String searchWord="file";
        while ((lines=br.readLine())!=null){
            if(lines.contains(searchWord)){
                System.out.println(lines);
            }
        }
        br.close();
        fr.close();
    }
}
