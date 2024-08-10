package in.co.nmsworks.week1;

/*
 * Write a Java method to find the longest word in a given sentence.
 */

public class Training9 {
    public void getLongestWord(String s){
        String[] words = s.split(" ");
        String longestWord = words[0];

        for(String word : words){
            if(word.length() > longestWord.length()){
                longestWord = word;
            }
        }
        System.out.println("Longest word: " + longestWord);
    }
}