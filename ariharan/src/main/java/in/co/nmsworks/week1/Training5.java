package in.co.nmsworks.week1;

import java.util.Scanner;

public class Training5 {
    public void printSentence() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the lines:");
        String words = sc.nextLine();
        String[] sentence = words.split("\\.");
        for (String i:sentence){
            System.out.println(i +".");
        }
    }
}