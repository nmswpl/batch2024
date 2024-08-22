package in.co.nmsworks.week3.day2;
/*
Write a Java program that reads a file named original.txt, replaces all occurrences of the word "old" with "new",
and writes the modified content to a file named modified.txt.
 */
import java.io.*;

public class Program7 {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("/home/nms/original.txt");
        BufferedReader bufferedReader = new BufferedReader(fr);

        FileWriter fw = new FileWriter("/home/nms/modified.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fw);

        String line = bufferedReader.readLine();
        String replace;

        while ((null != line)) {
            replace = line.replace("old","new");
            bufferedWriter.write(replace);
            bufferedWriter.newLine();
            line = bufferedReader.readLine();


        }bufferedWriter.close();
        fw.close();
        bufferedReader.close();
        fr.close();
    }
}




