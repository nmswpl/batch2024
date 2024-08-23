package in.co.nmsworks.week3.day4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Occurence {
    public static void main(String[] args) {
        Occurence occur = new Occurence();
        occur.occurence("/home/nms/Documents/India.txt","india");

    }
     public void occurence(String path,String containedWord){
         FileReader fr;
         try {
             fr = new FileReader(path);
             BufferedReader br = new BufferedReader(fr);
             String line;
             int count = 0;
             while ((line= br.readLine()) != null){
                 String[] words = line.split(" ");
                 for(String word : words){
                     System.out.println(word);
                     if(word.toLowerCase().contains(containedWord.toLowerCase())){
                         count++;
                     }
                 }
                 System.out.println("Occurence of the word is : "+count);
             }
             br.close();
             fr.close();
         } catch (IOException e) {
             e.printStackTrace();
         }
    }

    public void allWordOccurences(String path){

    }
}
