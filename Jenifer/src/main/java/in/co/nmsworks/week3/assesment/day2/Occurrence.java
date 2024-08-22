package in.co.nmsworks.week3.assesment.day2;
/* Write a Java program that reads a file named input.txt and searches for
occurrences of the word "file". Print out each line that contains the word "file".
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Occurrence {
    public void findWord() throws IOException {
        FileReader fileReader = new FileReader("/home/nms/Downloads/input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = "";
        while (line != null) {
            line = bufferedReader.readLine();
            if ("file".equals(line)){
                System.out.println(line);
            }
        }

        bufferedReader.close();
        fileReader.close();
    }
}