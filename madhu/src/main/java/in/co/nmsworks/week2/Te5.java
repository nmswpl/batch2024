package in.co.nmsworks.week2;

/* Write a program to check if a given Character is a Vowel or Consonant.*/
import java.util.Scanner;

public class Te5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single character: ");
        char ch = scanner.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||ch == 'u')
        {
            System.out.println(ch + " is a vowel.");
        }

        else
        {
            System.out.println(ch + " is a consonant.");
        }
    }
}