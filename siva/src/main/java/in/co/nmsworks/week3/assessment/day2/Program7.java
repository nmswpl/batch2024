package in.co.nmsworks.week3.assessment.day2;

import java.io.*;

/**
 * 7. Write a Java program that reads a file named original.txt, replaces all occurrences of the word "old" with "new", and writes the modified content to a file named modified.txt.
 *
 * 	original.txt:
 *
 * 		This is an old file.
 * 		The old data needs to be updated.
 * 		We are using the old method for now.
 * 		New projects are not affected by old settings.
 */

public class Program7 {
    public static void main(String[] args) throws IOException {
        FileReader fr  = new FileReader("/home/nms/original.txt");
        BufferedReader br = new BufferedReader(fr);

        FileWriter fw = new FileWriter("/home/nms/modified.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        String line = br.readLine();

        while (line != null){
            if(line.contains("old")){
                line=line.replaceAll("old","new");
                bw.write(line);
                bw.newLine();
            }

            line = br.readLine();
        }
        bw.close();
        fw.close();
    }
}
