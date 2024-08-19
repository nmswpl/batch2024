package in.co.nmsworks.weekend;
/*
Write a program to check if a given Character is a Vowel or Consonant.
 */

import java.util.Scanner;

public class Question5 {
    public void vowelOrConsonant(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the letter : ");
        String letter = scan.nextLine();
        if(letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u"))
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }
}
