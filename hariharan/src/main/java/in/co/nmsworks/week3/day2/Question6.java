package in.co.nmsworks.week3.day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question6 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("/home/nms/Downloads/input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int count =0;
        String line;

        while ((line = bufferedReader.readLine()) != null){
            if(line.contains("file")){
                count++;
                System.out.println(line);
            }
        }

        fileReader.close();
        bufferedReader.close();
        System.out.println(count);

    }
}
