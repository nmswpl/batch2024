package in.co.nmsworks.week1;

/**
 * Write a program to check if two words are palindrome
 * 	Input : dad
 * 	Output: Palindrome
 */

public class Training2 {
    String string1;
    public void isPalindrome(String s1) {
        this.string1 = s1;
        int length = string1.length()-1;
        String reverseString = "";
        char a=' ';
        System.out.println(s1);
        while(length>=0){
            a = string1.charAt(length);
            reverseString = reverseString.concat(String.valueOf(a));
            length--;
        }
        boolean isPalindrome = false;
        isPalindrome = string1.equals(reverseString);
        if(isPalindrome){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not an Palindrome");
        }
    }
}

