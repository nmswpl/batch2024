package in.co.nmsworks.week3.Day2;

import java.io.*;

public class Question7 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/home/nms/original.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("/home/nms/modified.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        String line = br.readLine();
        while (line != null) {
            bw.write(line.replaceAll("old","new"));
            bw.newLine();
            line = br.readLine();
        }
        br.close();
        bw.close();
        fr.close();
        fw.close();
        System.out.println("File modify success");
    }
}
