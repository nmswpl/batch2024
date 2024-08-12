package in.co.nmsworks.week1;

public class Training9 {
    //import java.util.*;

        public static void main(String[] args)
        {
            String s = "Praise the Lord";
            
            String[] words = s.split("\\ "); // Split the sentence into words using whitespace
            String largestWord = "";

            for (String i : words) {
                if (i.length() > largestWord.length()) {
                    largestWord = i;
                }
            }
            System.out.println("Largest word: " + largestWord);
            
        }
    }
