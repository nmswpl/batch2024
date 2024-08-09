package in.co.nmsworks.week1;

import java.util.Scanner;

/*
2. Write a program to check if two numbers are palindrome

	Input : dad

	Output: Palindrome
 */
class Training2 {
    private String input;

    public Training2(String input) {
        this.input = input;
    }
    public void isPalindrome() {

        int len = input.length() - 1;
        for (int i = 0; i <= len; i++) {
            if (input.charAt(i) != input.charAt(len - i)) {
                System.out.println("Not Palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
