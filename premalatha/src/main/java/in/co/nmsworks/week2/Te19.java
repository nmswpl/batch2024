package in.co.nmsworks.week2;
/*
 Given a String, Write a program to find if the string is palindrome or Not.
E.g (1) Input: str = “level”; Output: Palindrome
E.g (2) Input: str = “abc”; Output: Not Palindrome
 */

import java.util.Scanner;

public class Te19 {
    public void palindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();

        StringBuilder x = new StringBuilder(s);

        if (s.equals(x.reverse().toString())) {
            System.out.println("Palindrome \n");
        } else {
            System.out.println("Not Palindrome \n");
        }
    }
}





























 /*

public static void checkPalindrome(String s)
{
    // reverse the given String
    String reverse = new StringBuffer(s).reverse().toString();

    // check whether the string is palindrome or not
    if (s.equals(reverse))
        System.out.println("Yes");

    else
        System.out.println("No");
}

public static void main (String[] args)
        throws java.lang.Exception
{
    checkPalindrome("malayalam");
    checkPalindrome("GeeksforGeeks");
}
}*/