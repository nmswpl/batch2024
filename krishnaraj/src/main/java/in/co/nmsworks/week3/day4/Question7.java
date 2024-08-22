package in.co.nmsworks.week3.day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question7 {
public void countWordsInFile(){
    try {
        FileReader fileReader = new FileReader("/home/nms/Downloads/countWords.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        int count = 0;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            String[] words =line.split(" ");
            for (String word: words){
                count ++;
            }
        }
        System.out.println("The total word in text file is : " +count);
        bufferedReader.close();
        fileReader.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    public static void main(String[] args) {
        Question7 question7 = new Question7();
        question7.countWordsInFile();
    }
}

