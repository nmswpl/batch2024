package in.co.nmsworks.week3.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWordsFile {
    public static void main(String[] args) {
        CountWordsFile wf = new CountWordsFile();
        wf.countWordsInTheFile();
    }

    public void countWordsInTheFile(){

        try {
            FileReader fr = new FileReader("/home/nms/Documents/India.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            int count = 0;

            while (line != null){
                String[] words = line.split("");
                for (String word : words){
                    count++;
                }
                line = br.readLine();
            }
            System.out.println(count);
            br.close();
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
