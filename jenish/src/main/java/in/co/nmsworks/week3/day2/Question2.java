package in.co.nmsworks.week3.day2;

import java.io.*;

public class Question2 {
    public void printLineByLine() throws IOException {
        FileReader fw = new FileReader("/home/nms/Downloads/input.txt");
        BufferedReader bw = new BufferedReader(fw);

        String line = bw.readLine();
        while(line != null){
            System.out.println(line);
            line = bw.readLine();
        }
        bw.close();
        fw.close();
    }

    public static void main(String[] args) throws IOException {
        Question2 q2 = new Question2();
        q2.printLineByLine();
    }
}