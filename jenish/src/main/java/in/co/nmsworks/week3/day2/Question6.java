package in.co.nmsworks.week3.day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question6 {
    public void matchesPattern() throws IOException {
        FileReader reader = new FileReader("/home/nms/Downloads/input.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

        String line = bufferedReader.readLine();
        while(line != null){
            if(line.contains("file")){
                System.out.println(line);
            }
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        reader.close();
    }

    public static void main(String[] args) throws IOException {
        Question6 q6 = new Question6();
        q6.matchesPattern();
    }
}