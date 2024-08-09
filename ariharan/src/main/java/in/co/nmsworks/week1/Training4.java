package in.co.nmsworks.week1;
//Given a number as String, write a program that removes the leading 0
//Input :	0005640
//output:	5640

import java.util.Scanner;

public class Training4 {
    public void removingZero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the lines:");
        String words = sc.nextLine();
//        String[] arr=words.split("0");
//        String str=String.join("",arr);
//        System.out.println(str);
        int count=0;
        String str="123456789";
        for (int i = 0; i <words.length() ; i++) {
                String s= String.valueOf(words.charAt(i));
                if(str.contains(s)){
                    break;
                }
                else {
                    count++;
                }
        }
        System.out.println(words.substring(count));
    }
}
