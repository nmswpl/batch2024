package in.co.nmsworks.week2;
//Write a program to check if a given Character is a Vowel or Consonant.
import java.util.Scanner;

public class Te5 {
    public void VowelOrConsonants(char ch) {
        Scanner sc = new Scanner(System.in);
        String str = "AaEeIiOoUu";
        String word=String.valueOf(ch);
        if(str.contains(word)){
            System.out.println("it is a vowel");
        }
        else{
            System.out.println("it is a consonant");
        }
    }

}
