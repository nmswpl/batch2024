package in.co.nmsworks.week1;

import java.sql.SQLOutput;
/*  A Java program to print all words with even length in the given string.
	Input	: s = "This is a java language"
	Output	: This
		  is
		  java
		  language     */



public class Training3
{
     public Training3()
     //   public static void main(String[] args)
    {
        String a="Thi is an amazing day";
        String []s=a.split(" ");                            //{"This","is","an","amazing"," day"};
        for (int i = 0; i < s.length; i++) {
            String str = s[i];
            int l = str.length();
            if (l % 2 == 0) {
                System.out.println(s[i] + "  " + l);
            }
        }

       /* int l = s.length();
        for (int j = 0; j < (l - 1); j++)
        {
            int i = s.indexOf(" ");
            if (i % 2 == 0)
            {
                System.out.println(i);
                System.out.println(s.substring(0, i));
            }
            s = s.substring(i, (l - 1));
*/
        }
    }

