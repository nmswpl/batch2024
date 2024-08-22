package in.co.nmsworks.week3.day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
Problem-6: Write a program to count the number of words in a given file countWords.txt
Hello, world! This is a test paragraph. It contains various punctuation marks:
commas, periods, exclamation points, and question marks.
How many words will be counted? Let's find out!
 */
public class Program6 {
    public static void main(String[] args) {
        findOccurenceOfWords();
    }

    private static void findOccurenceOfWords() {

        try(FileReader fr = new FileReader("/home/nms/countWords.txt");
            BufferedReader br = new BufferedReader(fr)){

            String line =  br.readLine();
            int totalLength = 0;
            while (line != null){
                String[] words = line.split("[,!?\" ]");
                for (String word : words) {
                    System.out.println(word);
                }
                totalLength += words.length;
                line = br.readLine();

            }

            System.out.println("Total words:: " + totalLength);

        }
        catch (IOException e){
            System.out.println("Something went wrong!");
            e.printStackTrace();
        }

    }
}
