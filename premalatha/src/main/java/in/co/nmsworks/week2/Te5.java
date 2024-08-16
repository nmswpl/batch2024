package in.co.nmsworks.week2;
/*
Write a program to check if a given Character is a Vowel or Consonant.
 */
import java.util.Scanner;

public class Te5 {
    public void vowelOrConstant(){


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
