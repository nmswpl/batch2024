package in.co.nmsworks.week1;

import java.util.Scanner;

/** Write a program to reverse words in a Sentence.
	Input : India is my country.
	Output:	country my is India.**/

public class Training1 {
  public void reverseWords(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the lines:");
        String words=sc.nextLine();
        String []reverse=words.split(" ");
        for (int i = reverse.length-1; i >=0 ; i--) {
          System.out.print(reverse[i] +" ");

      }

    }
}
