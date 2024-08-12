package in.co.nmsworks.week2;

import java.util.Scanner;

public class TE5 {

    public void CheckVowelOrConsonant() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char:: ");
        String letter = sc.next();

        if (letter.length() > 1) {
            System.out.println("Character can't be more than one letter");
            return;
        }

        String vowels = "AEIOUaeiou";

        if (vowels.contains(String.valueOf(letter.charAt(0)))) {
            System.out.println("It is a vowel");
        }
        else if(letter.charAt(0) == '-' || letter.charAt(0) == '.' || letter.charAt(0) == ',' || letter.charAt(0) == '_'){
            System.out.println("It is not a alphabet");
        }

        else{
            System.out.println("It is a consonant");
        }


    }

}
