package in.co.nmsworks.weekend;
// Write a program to check if a given Character is a Vowel or Consonant.

import java.util.Scanner;

public class Qn5 {
    public void vowOrConson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter character");
        char ch = scanner.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
            default:
                if (ch >= 'a' && ch <= 'z') {
                    System.out.println("Consonant");
                }
                else {
                    System.out.println("Not a character");
                }
        }
    }
}
