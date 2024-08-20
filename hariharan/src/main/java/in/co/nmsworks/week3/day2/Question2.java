package in.co.nmsworks.week3.day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question2 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("/home/nms/Downloads/input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;

        while ((line=bufferedReader.readLine()) != null){
            System.out.println(line);
        }

        bufferedReader.close();
        fileReader.close();
    }
}
