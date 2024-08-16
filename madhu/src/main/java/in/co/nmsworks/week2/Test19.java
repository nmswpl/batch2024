package in.co.nmsworks.week2;
/* Given a String, Write a program to find if the string is palindrome or Not.
E.g (1) Input: str = “level”; Output: Palindrome
E.g (2) Input: str = “abc”; Output: Not Palindrome*/
import java.util.Scanner;

public class Test19
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter str =");
        String str = scanner.nextLine();
        int i = 0;
        int j = str.length() - 1;
        while(i<j) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("not a palindrome");
            }
            i++;
            j--;
        }
        System.out.println("palindrome");
    }
}
