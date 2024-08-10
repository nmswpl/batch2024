package in.co.nmsworks.week1;

/*
 * Write a program to check if two words are palindrome
	Input : dad
	Output: Palindrome
 */

public class Training2 {
    public void isPalindrome(String s) {
        String[] arr = s.split("");
        String s1 = "";

        for (int i = arr.length - 1; i >= 0 ; i--) {
            s1 += String.join(",",arr[i]);
        }
        if(s.equalsIgnoreCase(s1)){
            System.out.println("It is a Palindrome.");
        }
        else{
            System.out.println("It is not a Palindrome.");
        }
    }
}