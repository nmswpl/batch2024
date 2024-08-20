package in.co.nmsworks.week3.day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question3 {
    public void printNoOfLines() throws IOException {
        FileReader fw = new FileReader("/home/nms/Downloads/input.txt");
        BufferedReader bw = new BufferedReader(fw);

        String line = bw.readLine();
        int count = 0;

        while(line != null){
            line = bw.readLine();
            count++;
        }
        bw.close();
        fw.close();

        System.out.println("No of lines in the File :: "+count);
    }

    public static void main(String[] args) throws IOException {
        Question3 q3 = new Question3();
        q3.printNoOfLines();
    }
}