package in.co.nmsworks.week3.day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/*
7. Write a Java program that reads a file named original.txt, replaces all occurrences of the word "old" with "new", and writes the modified content to a file named modified.txt.

	original.txt:

		This is an old file.
		The old data needs to be updated.
		We are using the old method for now.
		New projects are not affected by old settings.
 */
public class Question7 {
    public static void main(String[] args) {
        try {
//            Readers
            FileReader fr = new FileReader("/home/nms/original.txt");
            BufferedReader br = new BufferedReader(fr);

//            Writers
            FileWriter fw = new FileWriter("/home/nms/modified.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            String line = br.readLine();

            while (line != null) {

                String modifiedLine = line.replaceAll("old", "new");
                fw.write(modifiedLine + "\n");
                line = br.readLine();
            }

            System.out.println("original.txt has been copied to modified.txt successfully");

            br.close();
            bw.close();

        } catch (Exception e) {
            System.out.println("Something went wrong!");
            e.printStackTrace();
        }
    }
}
