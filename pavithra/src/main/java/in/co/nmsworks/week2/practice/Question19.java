package in.co.nmsworks.week2.practice;

/**
 * Given a String, Write a program to find if the string is palindrome or Not.
 * E.g (1) Input: str = “level”; Output: Palindrome
 * E.g (2) Input: str = “abc”; Output: Not Palindrome
 */

public class Question19 {
    public static void main(String[] args) {
        String str = "levave";
        boolean isPalindrome = isPalindrome(str);

        if (isPalindrome) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is Not a Palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}


