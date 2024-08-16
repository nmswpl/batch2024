package in.co.nmsworks.week2;
// Write a program to check if a given Character is a Vowel or Consonant.

import java.util.Scanner;

public class Te5 {
    public void VowCons() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = scanner.next().toLowerCase().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                if (ch >= 'a' && ch <= 'z') {
                    System.out.println(ch + " is a consonant.");
                } else {
                    System.out.println(ch + " is not a letter.");
                }
        }
    }
}

