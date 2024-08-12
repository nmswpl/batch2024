package in.co.nmsworks.week2;
//Given a String, Write a program to find if the string is palindrome or Not.
//        E.g (1) Input: str = “level”; Output: Palindrome
//E.g (2) Input: str = “abc”; Output: Not Palindrome

public class Te19 {
    public  void ispalindrome(String str)
    {
        String reversestr = " ";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversestr+=str.charAt(i);

        }
        reversestr=reversestr.trim();
        if(reversestr.equals(str)){
            System.out.println("given string is palindrome");
        }
        else {
            System.out.println("given string is not a palindrome");
        }

    }
}
