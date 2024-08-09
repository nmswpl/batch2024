package in.co.nmsworks.week1;
//Write a Java program to count the number of vowels and consonants in a given string.

import java.util.Scanner;

public class Training6 {
    public void countVowelsAndConsonants(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentence:");
        String words = sc.nextLine();
        int vowcount=0,conscount=0;
        String str="AaEeIiOoUu";
        String str1=" ,.-";
        for (int i = 0; i <words.length() ; i++) {
            String s= String.valueOf(words.charAt(i));
            if(str.contains(s)){
                vowcount++;
            }
            else if (str1.contains(s)) {

            } else {
                conscount++;
            }
        }
        System.out.println("count of vowels:" + vowcount);
        System.out.println("count of consonants:" + conscount);

    }
}
