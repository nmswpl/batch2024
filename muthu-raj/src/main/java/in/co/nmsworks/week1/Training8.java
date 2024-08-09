package in.co.nmsworks.week1;

import java.util.Scanner;

/*
8. Write a Java method to convert  every word in a sentence to title case, where the first letter of each word is capitalized.

	Input : "the quick brown fox jumps over the lazy dog";

	Output: "The Quick Brown Fox Jumps Over The Lazy Dog"
 */
class Training8 {
    private String input;

    public Training8(String input){
        this.input = input;
    }

    public void convertToTitleCase() {

        String[] words = input.split(" ");

        for (String word : words) {

            String firstLetter = String.valueOf(word.charAt(0)).toUpperCase();
            System.out.print(firstLetter + word.substring(1) + " ");

        }
    }
}
