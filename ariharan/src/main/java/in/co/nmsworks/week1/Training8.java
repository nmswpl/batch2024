package in.co.nmsworks.week1;
//Write a Java method to convert a every word in a sentance to title case, where the first letter of each word is capitalized.
//        Input : "the quick brown fox jumps over the lazy dog";
//Output: "The Quick Brown Fox Jumps Over The Lazy Dog"

import java.util.Scanner;

public class Training8 {
    public void convLowTOUpper(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentence:");
        String words = sc.nextLine();
        String str[]=words.split(" ");
        for (int i = 0; i < str.length ; i++) {
            String s = str[i];
            String st = String.valueOf(s.charAt(0)).toUpperCase();
            System.out.print(st+s.substring(1)+" ");
        }
    }
}
