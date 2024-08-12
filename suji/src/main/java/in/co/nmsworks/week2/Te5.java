package in.co.nmsworks.week2;

// Write a program to check if a given Character is a Vowel or Consonant.

import java.util.*;
public class Te5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    String s;
    System.out.println("Enter a character");
    s=sc.next();


            if( (s.equals("a")) ||(s.equals("A"))||(s.equals("e")) ||
                    (s.equals("E")) ||(s.equals("u"))|| (s.equals("U")) || (s.equals("o")) || (s.equals("O")) || (s.equals("i")) || ((s.equals("I")) ) )
                   {
                System.out.println("Vowel ="+s);
            } else
                System.out.println("Consonant="+s);
        }
    }







