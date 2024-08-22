package in.co.nmsworks.week3.assignment.Day2;

import java.io.*;

/* Write a Java program that reads a file named original.txt, replaces all occurrences of the word "old" with "new", and writes the modified content to a file named modified.txt.

	original.txt:

		This is an old file.
		The old data needs to be updated.
		We are using the old method for now.
		New projects are not affected by old settings.*/
public class Q7 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/home/nms/original.txt");
        BufferedReader buffer = new BufferedReader(fr);

        FileWriter fw = new FileWriter("/home/nms/modified.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        String str = buffer.readLine();
        String newValue;
        while (str != null) {
            newValue = str.replace("old", "new");
            bw.write(newValue);
            bw.newLine();
            str = buffer.readLine();
        }

        buffer.close();
        fr.close();
        bw.close();
        fw.close();
    }
}
