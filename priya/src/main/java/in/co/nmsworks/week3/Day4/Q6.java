package in.co.nmsworks.week3.Day4;

import java.io.*;
import java.util.Arrays;

public class Q6 {
    String[] lines={};
    public void wordCount() throws IOException {
        try (FileReader fr = new FileReader("/home/nms/countWords.txt");
             BufferedReader bf = new BufferedReader(fr);
             )
        {
            String line ;
            int count=0;
            while((line=bf.readLine())!=null) {
                lines = line.split("\\s+");
                for (String s : lines) {
                    count++;
                }

            }
            System.out.println(count);
            System.out.println(Arrays.toString(lines));




    } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
