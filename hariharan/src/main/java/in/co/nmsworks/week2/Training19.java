package in.co.nmsworks.week2;

import java.util.Scanner;

public class Training19 {
    public Training19() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();

        StringBuilder x = new StringBuilder(s);

        if (s.equals(x.reverse().toString())) {
            System.out.println("Palindrome \n");
        } else {
            System.out.println("Not Palindrome \n");
        }
    }
}
