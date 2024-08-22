package in.co.nmsworks.week3.day4;
//Write a program to count the number of words in a given file countWords.txt.
//        Hello, world! This is a test paragraph. It contains various punctuation marks:
//commas, periods, exclamation points, and question marks. How many words will be counted? Let's find out!

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Program6 {
    public static void main(String[] args) {
        new Program6().countWords();
    }
    public void countWords(){
        try {
            FileReader fr = new FileReader("/home/nms/count.txt");
            BufferedReader br = new BufferedReader(fr);
            String lines;
            int count=0;
            while ((lines = br.readLine()) != null) {
                String[] words=lines.split(" ");
                count+=words.length;
            }
            System.out.println("number of words in the file is::"+count);
            br.close();
            fr.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
