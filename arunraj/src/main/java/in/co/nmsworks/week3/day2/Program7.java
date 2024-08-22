package in.co.nmsworks.week3.day2;

/*
Write a Java program that reads a file named original.txt,
replaces all occurrences of the word "old" with "new", and writes the modified
content to a file named modified.txt.

	original.txt:

		This is an old file.
		The old data needs to be updated.
		We are using the old method for now.
		New projects are not affected by old settings.
 */

import java.io.*;

public class Program7 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/home/nms/Desktop/original.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("/home/nms/Desktop/modified.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        String line = br.readLine();

        while (line != null){
            if (line.contains("old")) {
                String name = line.replaceAll("old","new");
                bw.write(name);
                bw.newLine();
                line = br.readLine();
                System.out.println(name);
            }
        }
        bw.close();
        fw.close();
        br.close();
        fr.close();
    }
}
