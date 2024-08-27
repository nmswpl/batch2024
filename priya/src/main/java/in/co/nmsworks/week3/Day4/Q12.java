package in.co.nmsworks.week3.Day4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q12 {
    List<String[]> ListOflines = new ArrayList<>(); ;
    String[] lines;
    int count;
    public int getCountOfWord(String filepath, String wordToSearch) {
        try (FileReader fr = new FileReader(filepath);
             BufferedReader bf = new BufferedReader(fr)) {
            String line;
            while ((line = bf.readLine())!=null){
                lines = line.trim().split("\\s+");
                for (String s : lines) {
                    if(s.contains(wordToSearch)){
                        count++;
                    }
                }
                bf.readLine();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        return count;
    }

    public static void main(String[] args) {
        Q12 q12 = new Q12();
        System.out.println(q12.getCountOfWord("/home/nms/India.txt","India"));
    }
}
