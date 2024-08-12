package in.co.nmsworks.week2;

import java.util.Scanner;

public class TE19 {
    public void palindrome(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input:: ");
        String input = sc.nextLine();

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
