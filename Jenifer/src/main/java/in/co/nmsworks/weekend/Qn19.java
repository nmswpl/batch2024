package in.co.nmsworks.weekend;
/* Given a String, Write a program to find if the string is palindrome or Not.
E.g (1) Input: str = “level”; Output: Palindrome
E.g (2) Input: str = “abc”; Output: Not Palindrome */

public class Qn19 {
    public void palindrome(){
        String string = "Level";
        String revString = "";
        for (int i = string.length()-1; i >= 0; i--) {
            revString = revString + string.charAt(i);
        }
        if (revString.trim().equalsIgnoreCase(string.trim())){
            System.out.println(string + " is palindrome.");
        }else {
            System.out.println(string + " is not a palindrome");
        }
    }
}
