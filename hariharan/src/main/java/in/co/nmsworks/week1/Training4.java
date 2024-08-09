package in.co.nmsworks.week1;

import java.util.Scanner;

public class Training4 {

       public Training4(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: \n");
        String number = sc.nextLine();

        String result = "";

        for(int i =0; i<number.length();i++){
            if(number.charAt(i) != '0'){
                result = number.substring(i);
                System.out.println("Answer:" + result+"\n");
                break;
            }
        }

    }
}
