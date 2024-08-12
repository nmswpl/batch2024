package in.co.nmsworks.week2;

import java.util.Scanner;

public class Training5
{

   public Training5(){


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the letter:");
        String letter = sc.nextLine();

        if(letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("i")|| letter.equalsIgnoreCase("o") || letter.equalsIgnoreCase("u")){
            System.out.println("Vowel\n");
        }else{
            System.out.println("Consonant\n");
        }

    }
}
