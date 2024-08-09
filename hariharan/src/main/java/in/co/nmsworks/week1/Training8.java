package in.co.nmsworks.week1;

import java.util.Scanner;

public class Training8 {

public  Training8(){

        String result = "";
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Line:");
        String word = sc.nextLine();

        String[] words = word.split(" ");

        for(int i =0;i<words.length;i++){
            String first = words[i].substring(0,1).toUpperCase();
            String remaining = words[i].substring(1,words[i].length());
            result += first + remaining + " ";
        }
        System.out.println(result+ "\n");
    }
}
