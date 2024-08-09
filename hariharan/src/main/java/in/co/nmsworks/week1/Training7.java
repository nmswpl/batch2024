package in.co.nmsworks.week1;

import java.util.Scanner;

public class Training7 {

    public Training7(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Line: ");
        String line = sc.nextLine();

        String newString="";

        for(int i =0;i<line.length();i++){
           char c = line.charAt(i);
           if(newString.indexOf(c) <0){
               newString += c;
           }
        }
        System.out.println(newString+"\n");
    }
}
