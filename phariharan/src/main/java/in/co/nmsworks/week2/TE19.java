package in.co.nmsworks.week2;

/**
 * . Given a String, Write a program to find if the string is palindrome or Not.
 * E.g (1) Input: str = “level”; Output: Palindrome
 * E.g (2) Input: str = “abc”; Output: Not Palindrome
 */

public class TE19 {
    public void isPalindrome(String s1) {
        int length = s1.length()-1;
        String reverseString = "";
        char a=' ';
        System.out.println(s1);
        while(length>=0){
            a = s1.charAt(length);
            reverseString = reverseString.concat(String.valueOf(a));
            length--;
        }
        boolean isPalindrome = false;
        isPalindrome = s1.equals(reverseString);
        if(isPalindrome){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not an Palindrome");
        }
    }
}
