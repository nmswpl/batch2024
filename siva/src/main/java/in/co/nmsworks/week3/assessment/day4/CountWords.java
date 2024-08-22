package in.co.nmsworks.week3.assessment.day4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("/home/nms/countWords.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            int count = 0;

            while(line != null){
                String[] array = line.split(" ");
                count += array.length;
                line = br.readLine();



            }
            br.close();
            fr.close();
            System.out.println(count);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
