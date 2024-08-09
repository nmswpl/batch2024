package in.co.nmsworks.week1;
//Given a string str, write a Java program to print all words with even length in the given string.

import java.util.Scanner;

public class Training3 {
    public void printEvenLengthWords(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the lines:");
        String words=sc.nextLine();
        String arr[]=words.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String str=arr[i];
            if((str.length()%2)==0){
                System.out.println(str);
            }
        }
    }
}
