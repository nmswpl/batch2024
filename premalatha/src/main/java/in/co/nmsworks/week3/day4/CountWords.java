package in.co.nmsworks.week3.day4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {
    public void countWordsInFile() throws IOException {
        FileReader fr = new FileReader("/home/nms/india.txt");
        BufferedReader br = new BufferedReader(fr);
        int count = 0;
        String line;
        while((line = br.readLine()) != null) {
            String words[] = line.split(" ");
            count = count + words.length;
        }
            System.out.println("Number of words present in given file: " + count);
            br.close();
        }

    public static void main(String[] args) throws IOException {

        CountWords cw = new CountWords();
        cw.countWordsInFile();
    }
}

