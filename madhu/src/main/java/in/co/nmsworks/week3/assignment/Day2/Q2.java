package in.co.nmsworks.week3.assignment.Day2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Q2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/home/nms/input.txt");
        BufferedReader buffer = new BufferedReader(fr);
        String str;
        while((str= buffer.readLine()) != null){
            System.out.println(str);
        }buffer.close();
        fr.close();
    }
}
