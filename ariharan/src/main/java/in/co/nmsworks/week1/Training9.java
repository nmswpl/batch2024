package in.co.nmsworks.week1;
//Write a Java method to find the longest word in a given sentence.
//        Input: "The quick brown fox jumps over the lazy dog"
//Output: "jumps"

import java.util.Scanner;

public class Training9 {
    public void longWord(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentence:");
        String words = sc.nextLine();
        String str[]=words.split(" ");
        int count=0,index=0;

        for (int i = 0; i < str.length ; i++) {
            String s=str[i];
            if(s.length()>count){
                count=s.length();
                index=i;
            }
        }
        System.out.println("the longest word in string is:" + str[index]);
    }

}
