package in.co.nmsworks.weekend;
/*
Given a String, Write a program to find if the string is palindrome or Not.
E.g (1) Input: str = “level”; Output: Palindrome
E.g (2) Input: str = “abc”; Output: Not Palindrome
 */

import java.util.Scanner;

public class Question19 {
    public void palindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();

        String strValue="dad";
        String reverseStr = "";
        for (int i = strValue.length()-1; i >= 0; i--) {
            reverseStr=reverseStr+strValue.charAt(i);
        }
        if(strValue.equals(reverseStr)){
            System.out.println("This is an palinrome");
        }
        else {
            System.out.println("This is not an palinrome");
        }

        }
}
