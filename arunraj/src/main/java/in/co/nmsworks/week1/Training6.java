package in.co.nmsworks.week1;
import java.util.Scanner;

/*6. Write a Java program to count the number of vowels and consonants in a given string.
Input: "Hello World"
Output: Vowels: 3, Consonants: 7*/

public class Training6 {
    String str="Hello World";
    public void vowelsConsonants() {
        //String[] str2 = str.split(" ");
        int vowel = 0;
        int consonant = 0;
        for (int i=0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a') {
                vowel++;
            } else if (c =='e')
            {
                vowel++;
            }
            else if (c=='i')
            {
                vowel++;
            }
            else if (c=='o')
            {
                vowel++;
            }
            else if (c=='u')
            {
                vowel++;
            }
            else {
                consonant++;
            }
        }
        System.out.println("Vowels : " + vowel);
        System.out.println("Consonants : " + consonant);
    }
}
