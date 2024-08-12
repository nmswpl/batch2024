package in.co.nmsworks.week2;

import java.util.Scanner;

public class TE8 {

    public void printInWords(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three digit number:: ");
        String number =  sc.nextLine();

        if(number.length() > 3 || number.isEmpty())
        {
            System.out.println("Invalid number");
            return;
        }

        if(number.charAt(0) == '1'){
            System.out.println("ONE");
        } else if (number.charAt(0) == '2') {
            System.out.println("TWO");
        }
        else if (number.charAt(0) == '3'){
            System.out.println("THREE");
        }
        else if(number.charAt(0) == '4'){
            System.out.println("FOUR");
        }

        else if(number.charAt(0) == '5'){
            System.out.println("FIVE");
        }
        else if (number.charAt(0) == '6'){
            System.out.println("SIX");
        }
        else if (number.charAt(0) == '7')
        {
            System.out.println("EIGHT");
        }
        else if (number.charAt(0) == '9') {
            System.out.println("NINE");

        } else if (number.charAt(0) == '0') {
            System.out.println("ZERO");
        }
        else{
            System.out.println("not a number");
        }
    }

}
