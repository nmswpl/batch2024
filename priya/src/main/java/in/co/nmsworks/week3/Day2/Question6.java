package in.co.nmsworks.week3.Day2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Question6 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/home/nms/input.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while (line != null) {
            if(line.contains("file")){
                System.out.println(line);
            }
            line = br.readLine();

        }
    }
}
