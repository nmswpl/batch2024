package in.co.nmsworks.week2;

// Write a program to check if a given Character is a Vowel or Consonant.

import java.util.*;
class Te5 {
    String s;
    public Te5(String s)
    {  this.s=s;
        if( (s.equals("a")) ||(s.equals("A"))||(s.equals("e")) ||
                (s.equals("E")) ||(s.equals("u"))|| (s.equals("U")) || (s.equals("o")) || (s.equals("O")) || (s.equals("i")) || ((s.equals("I")) ) )
        {
            System.out.println("Vowel ="+s);
        } else
            System.out.println("Consonant="+s);
    }
}


