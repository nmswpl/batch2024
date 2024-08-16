package in.co.nmsworks.week2;
/* Given a String, Write a program to find if the string is palindrome or Not.
E.g (1) Input: str = “level”; Output: Palindrome
E.g (2) Input: str = “abc”; Output: Not Palindrome */

import java.util.Scanner;

public class Te19 {
    public  void palindrome(){
        String string = "level";
        String reverseString = "";
        for (int i = string.length()-1; i >=0 ; i--) {
            reverseString = reverseString + string.charAt(i);
        }
        if(reverseString.equals(string)){
            System.out.println(string + " is palindrome");
        }
        else {
            System.out.println(string + " is not a palindrome");
        }

    }
}
