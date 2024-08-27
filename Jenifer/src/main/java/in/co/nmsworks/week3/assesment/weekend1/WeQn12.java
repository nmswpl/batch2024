package in.co.nmsworks.week3.assesment.weekend1;
/* Write a program that reads a file using `FileReader` and
wraps it with `BufferedReader` to efficiently read the content.
Count and print the number of lines in the file.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WeQn12 {
    public void countAndPrintLine(){
        try {
            FileReader fr = new FileReader("/home/nms/Documents/Input.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            int count = 0;
            while (line != null){
                line = br.readLine();
                System.out.println(line);
                count++;
            }
            System.out.println("Number of lines : " +count);
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
