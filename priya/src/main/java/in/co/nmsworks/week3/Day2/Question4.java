package in.co.nmsworks.week3.Day2;

import java.io.*;

public class Question4 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/home/nms/input.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("/home/nms/output1.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        String line = br.readLine();
        while (line != null) {
            bw.write(line);
            bw.newLine();
            line = br.readLine();

        }
        br.close();
        bw.close();
        fr.close();
        fw.close();
        System.out.println("File copy success");
    }
}
